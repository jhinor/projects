layui.config({
    base: 'webjars/jui/js/modules/'
}).use(['jquery', 'tab', 'navbar', 'layer'], function () {
    var $ = layui.jquery,
        layer = layui.layer,
        navbar = layui.navbar(),
        tab = layui.tab({
            elem: '.admin-nav-card'
        });


    $('.myTabs>li').click(function () {
        var ids = $(this).attr('aria-controls');

        $('.nav_wraper ul').css('display', 'none');
        $('#' + ids).css('display', 'block');

        $('.myTabs li').removeClass('active');
        $('.' + ids).addClass('active');
    });

    $('#infoDesc').hover(function () {
        $(this).find('ul').show();
    }, function () {
        $(this).find('ul').hide();
    });


    $(window).on('resize', function () {
        var $content = $('.admin-nav-card .layui-tab-content');
        $content.height($(this).height() - 147);
        $content.find('iframe').each(function () {
            $(this).height($content.height());
        });
    }).resize();

    navbar.set({
        spreadOne: true,
        elem: '#admin-navbar-side',
        cached: false,
        url: './datas/nav.json'
    });
    navbar.render();
    navbar.on('click(side)', function (data) {
        tab.tabAdd(data.field);
    });

});