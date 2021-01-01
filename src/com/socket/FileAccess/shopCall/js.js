$(function() {
    //判断有没有可以结算的内容
    isresult();
    //写入索引号
    var lis = document.querySelector('.J-filterBar').children;
    for (var i = 0; i < lis.length; i++) {
        lis[i].setAttribute("index", i);
    }
    //定义位置
    var currenPositon = $(".line .curren").css("left");
    //鼠标进入和退出
    $(".J-filterBar li").hover(function() {
            var index = $(this).index();
            var num = index * $(this).width();
            $(".line .curren").css("left", '' + num + 'px');
        }, function() {
            $(".line .curren").css("left", currenPositon);
        })
        //鼠标点击的时候更新小点坐标
    $(".J-filterBar li").click(function() {
            var index = $(this).index();
            var num = index * $(this).width();
            console.log(num);
            currenPositon = num;
            $(".line .curren").css("left", '' + num + 'px');
            $(this).find("strong").addClass("current");
            console.log($(this).siblings().find("strong"));
            $(this).siblings().find("strong").removeClass("current");
        })
        //全选按钮发生改变的时候
    $(".all").change(function() {
            $(".J_son").prop("checked", $(this).prop("checked"));
            $(".all").prop("checked", $(this).prop("checked"));
            //修改背景颜色
            if ($(this).prop("checked")) {
                $(".J_item").addClass("checked-item");
            } else {
                $(".J_item").removeClass("checked-item");
            }
            isresult();
            counts();
        })
        //单个按钮发生改变的时候
    $(".J_son").change(function() {
            isresult();
            counts();
            if ($(".J_son:checked").length === $(".J_son").length) {
                $(".all").prop("checked", $(this).prop("checked"));

            } else {
                $(".all").prop("checked", false)
            }
            //修改颜色
            if ($(this).prop("checked")) {
                $(this).parents(".J_item").addClass("checked-item");
            } else {
                $(this).parents(".J_item").removeClass("checked-item");
            }
        })
        //控制商品的数量
    var n = $(".te").val();
    //增加数量
    $(".plus").click(function() {
        n++;
        $(this).siblings(".te").val(n);
        //计算价格
        var p = $(this).parent().siblings(".price").html();
        //去掉￥字符
        p = p.substr(1);
        //修改总额
        $(this).parent().siblings(".totalPrice").html("￥" + (p * n).toFixed(2));
        console.log($(".te").val());
        counts();
    });
    //减少数量
    $(".reduce").click(function() {
            if (n > 1) {
                n--;
            } else return;
            $(this).siblings(".te").val(n);
            //计算价格
            var p = $(this).parent().siblings(".price").html();
            //去掉￥字符
            p = p.substr(1);
            //修改总额
            $(this).parent().siblings(".totalPrice").html("￥" + (p * n).toFixed(2));
            counts();
        })
        //修改文本框里面的值
    $(".te").change(function() {
            var s = $(this).val();
            if (s > 0 && s <= 195) {
                $(this).val(s);
            } else {
                $(this).val(n);
            }
            //计算价格
            var p = $(this).parent().siblings(".price").html();
            //去掉￥字符
            p = p.substr(1);
            //修改总额
            $(this).parent().siblings(".totalPrice").html("￥" + (p * $(this).val()).toFixed(2));
            counts();
        })
        //商品计算函数
    function counts() {
        var count = 0;
        var money = 0;
        //判断是否是否被勾选，如果勾选则计算其价格
        $(".J_item").each(function(i, ele) {
                if ($(ele).find(".J_son").prop("checked")) {
                    count += parseInt($(ele).find(".te").val());
                    var p = $(ele).find(".totalPrice").text();
                    p = p.substr(1);
                    money += parseInt(p);
                }
            })
            //写入最后的价格和选择的数量
        $(".J_carfooter").find(".number").text(count);
        $(".J_carfooter").find(".totalPrice").text("￥" + money.toFixed(2));
    }
    //判断是否可以结束页面
    function isresult() {
        //判断是否可以结算
        if ($(".J_son:checked").length === 0) {
            $(".J_carfooter").find(".result").prop("href", "javascript:;");
            $(".J_carfooter").find(".result").css({
                backgroundColor: "#cfcfcf",
                cursor: "not-allowed",
            });

        } else {
            $(".J_carfooter").find(".result").prop("href", "");
            $(".J_carfooter").find(".result").css({
                backgroundColor: "rgb(242,45,0)",
                cursor: "pointer",
            });
        }
    }
    //删除按钮
    $(".del").click(function() {
        $(".J_son:checked").parents(".J_item").remove();
    })
})