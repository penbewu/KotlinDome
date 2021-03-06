package com.example.kotlindome.bean;

import java.io.Serializable;
import java.util.List;

/**
 * 开发者   biwu
 * 创建时间 2021/8/28
 * 描述
 */
public class NewsBean implements Serializable {


    /**
     * reason : success!
     * result : {"stat":"1","data":[{"uniquekey":"70976ec04725897453fbd8663dd45120","title":"莱西12岁男孩不慎溺水，警民合力成功施救","date":"2021-08-28 11:27:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828112723110306437.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112723_45530b27834b90284a57f47499e753e6_1_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"a6a7679384de05a6db449f03539d4d81","title":"四川广元：农商银行员工赵某从噩梦中惊醒","date":"2021-08-28 11:27:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828112720186668978.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112720_3bc10c8d15f0463cbe45759f579e6ad3_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112720_3bc10c8d15f0463cbe45759f579e6ad3_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112720_3bc10c8d15f0463cbe45759f579e6ad3_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"56091b094350b762f3bdbdb880d6b632","title":"融安县公安局大将派出所拟招聘3名辅警人员","date":"2021-08-28 11:27:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828112717951639327.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112717_2579648ed1a3e9dd81b95d2f7798c445_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112717_2579648ed1a3e9dd81b95d2f7798c445_2_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"589f87309494d833d038fd631a874ca4","title":"靠喝脏水续命，郑州暴雨被困车库4天3夜男子出院回忆：\u201c放弃很简单 我妻子怎么办？\u201d","date":"2021-08-28 11:27:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828112710150404583.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112710_98aa67ebc417f942e7960017864dff3e_1_mwpm_03201609.png","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112710_98aa67ebc417f942e7960017864dff3e_2_mwpm_03201609.png","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112710_98aa67ebc417f942e7960017864dff3e_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"570d47bae50f279005ffbee58be47064","title":"神童张易文，10岁读大学，如今月薪两千他经历了什么？","date":"2021-08-28 11:27:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828112710112468229.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112710_fa27f35d071a328f346301c560b56eaa_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112710_fa27f35d071a328f346301c560b56eaa_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112710_fa27f35d071a328f346301c560b56eaa_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"74d762040efcae8c9159b655115451f8","title":"健身房关门跑路预付费难退，多方协调联盟成员援手续课程","date":"2021-08-28 11:20:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828112038674551000.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112038_9b0a32d6347650af9665222eeebe83e6_1_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"9624c2d340067d69ceef7d1e92e349d6","title":"苦劝8小时，南昌女警花成功止损14万","date":"2021-08-28 11:20:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828112038494619273.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112038_cbf4194a40f86632e60df1fa562e5a93_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112038_cbf4194a40f86632e60df1fa562e5a93_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112038_cbf4194a40f86632e60df1fa562e5a93_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"1c281cce1db2298b7575159cc9b70bfc","title":"在最后一段时光里，他们\u201c让逝者有尊严，让生者无遗憾\u201d","date":"2021-08-28 11:20:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828112037782841064.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112037_364f72e4bdb8227a9af6c65ea78189aa_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112037_364f72e4bdb8227a9af6c65ea78189aa_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112037_364f72e4bdb8227a9af6c65ea78189aa_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"386018c95214c1df2c613f8134f83670","title":"大连一高层公寓突发大火，外墙保温材料着火脱落，818名居民免费入住酒店","date":"2021-08-28 11:20:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828112036053110515.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112036_0dd7e17bce1e796a2d8bd31a89c8ff9a_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112036_0dd7e17bce1e796a2d8bd31a89c8ff9a_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112036_0dd7e17bce1e796a2d8bd31a89c8ff9a_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"8a8c5d2c766df335d47172bec1f28721","title":"事发乐平！废铁、铜线失窃，警方一看监控：眼熟！","date":"2021-08-28 11:20:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828112035522963167.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112035_5e628a74d53ddc31488cc7bb88158d70_2_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112035_5e628a74d53ddc31488cc7bb88158d70_3_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112035_5e628a74d53ddc31488cc7bb88158d70_4_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"513f253cdb3ba318b29cb06c0bc45dad","title":"看！这个边境派出所又来锦旗了","date":"2021-08-28 11:20:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828112033746794331.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112033_e26930ded639530d8414b365c7c9e605_1_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"7579e96821c444428798046e399be7c2","title":"唐山这些身影，很有young！","date":"2021-08-28 11:20:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828112033416658508.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112033_10e343b8ef51a89acbb4de26675eff2c_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112033_10e343b8ef51a89acbb4de26675eff2c_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112033_10e343b8ef51a89acbb4de26675eff2c_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"603654ee48131849753a8b6a5a1fb3dd","title":"上游评论：校园不让带手机却允许商家卖手机 校长免职后更要追责商家不当竞争","date":"2021-08-28 11:20:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828112033383292613.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112033_29230ab2c8f74e0d248ee56c7d3fcbb4_1_mwpm_03201609.png","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112033_29230ab2c8f74e0d248ee56c7d3fcbb4_2_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"cdea9c40979804685de9c7dac464cc9b","title":"一小车撞断隔离护栏！雨天路滑驾车需谨慎","date":"2021-08-28 11:20:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828112027354999362.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112027_559692925ff4af2cf4b67917b014439a_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112027_559692925ff4af2cf4b67917b014439a_2_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"a39ca8abb804b3b09e2e2071f882c0c3","title":"农民工在城市打工，干活一天两三百元工资为什么到月底还是没钱？","date":"2021-08-28 11:20:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828112026562817751.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112026_f1c55270a024b3c953ac6316b9721c18_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112026_f1c55270a024b3c953ac6316b9721c18_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112026_f1c55270a024b3c953ac6316b9721c18_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"7b74c1170811bc67c31a066fd7cda6f5","title":"53万人装上\u201c反诈神器\u201d，东昌府区电信诈骗发案率降了50%","date":"2021-08-28 11:20:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828112024444229982.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112024_9dddd97defd7b4bbcefcccf6baa28683_1_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"91b3d7acf987e1675fa420a7eeced39a","title":"\"敌敌畏\"杀蚊子！男子欲带剧毒农药上火车被行拘","date":"2021-08-28 11:20:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828112023926670526.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112023_f1cfe935c71e74f48393240e54fa144f_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112023_f1cfe935c71e74f48393240e54fa144f_2_mwpm_03201609.png","is_content":"1"},{"uniquekey":"b8af6142a858199f3b6693db927c49c7","title":"八旬老人致信点赞中国光大银行烟台蓬莱支行周到服务","date":"2021-08-28 11:20:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828112020661576879.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112020_e2b653d6ca514e24296a2e70e1d28baa_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112020_e2b653d6ca514e24296a2e70e1d28baa_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112020_e2b653d6ca514e24296a2e70e1d28baa_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"cfdef07f2fb3d995d34c7f173dd112cf","title":"一天接三锦旗，官桥派出所破案追赃感动受害人","date":"2021-08-28 11:20:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828112016510157841.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112016_43238000fdf136468c7b36811458b3c6_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112016_43238000fdf136468c7b36811458b3c6_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112016_43238000fdf136468c7b36811458b3c6_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"1930a8bfc4004cb65ae4e3fbe8c72bf1","title":"密云一农用三轮车侧翻，5人被困河道！救援冲锋舟出动！","date":"2021-08-28 11:14:00","category":"头条","author_name":"北京日报","url":"https://mini.eastday.com/mobile/210828111415319234890.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111415_da4646d73815be1e34ffe25dceab0ef5_1_mwpm_03201609.png","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111415_da4646d73815be1e34ffe25dceab0ef5_2_mwpm_03201609.png","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111415_da4646d73815be1e34ffe25dceab0ef5_3_mwpm_03201609.png","is_content":"1"},{"uniquekey":"0246cd8cecd11409c6529a328eef7432","title":"自称王某文妻子者替丈夫辩护，如事有反转，王某文是否可反诉周某","date":"2021-08-28 11:13:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828111352061689032.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111352_5e3ba9f568c8797242b4797bb350badd_1_mwpm_03201609.png","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111352_5e3ba9f568c8797242b4797bb350badd_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111352_5e3ba9f568c8797242b4797bb350badd_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"5e7061ac2fb80b4ced7194f5f869a3f6","title":"这是什么操作？有人邮递液化气罐24个入境，海关：均属危险化学品","date":"2021-08-28 11:13:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828111351102612134.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111351_fcac7b277e0d8826f15bb459211cc4e6_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111351_fcac7b277e0d8826f15bb459211cc4e6_2_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"6f421f632e1a5c5a00ccc9e08ba2d90d","title":"宅基地制度改革中！2点变化村民无法避免，早点做好心理准备","date":"2021-08-28 11:13:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828111350792937175.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111350_0464609c6be631b0ea3ebefe56cf06b1_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111350_0464609c6be631b0ea3ebefe56cf06b1_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111350_0464609c6be631b0ea3ebefe56cf06b1_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"929ab531267494ba5871bd696edc0e5f","title":"因为卸载了一款APP，银行职工被骗30余万\u2026\u2026","date":"2021-08-28 11:13:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828111346487945563.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111346_726da5b9ef306030ebf7ea8851c30373_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111346_726da5b9ef306030ebf7ea8851c30373_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111346_726da5b9ef306030ebf7ea8851c30373_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"f12841157919514da57ba72882a5b4be","title":"成都市聋协副主席罗小玮：用手语为聋人架起与外界沟通的桥梁","date":"2021-08-28 11:13:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828111341388388393.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111341_0ba20ef895304919769c9616adc10861_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111341_0ba20ef895304919769c9616adc10861_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111341_0ba20ef895304919769c9616adc10861_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"8637a90c5772ef0c72e24da28ca0465f","title":"通过120次沟通法官帮当事人拿到71万丨我为群众办实事","date":"2021-08-28 11:13:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828111338070808406.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111338_e18a36c05ad82288a718c99671144166_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111338_e18a36c05ad82288a718c99671144166_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111338_e18a36c05ad82288a718c99671144166_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"731a1a192d5cf7cc5222fe08700398ac","title":"拿毛巾给车牌\u201c降温\u201d？这操作也太野了吧","date":"2021-08-28 11:13:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828111337086878993.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111337_49ef0f24546eaacb871d32a2bdb38374_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111337_49ef0f24546eaacb871d32a2bdb38374_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111337_49ef0f24546eaacb871d32a2bdb38374_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"ef730845066fe9a271bd890edf9ec2ad","title":"铁路上，有这样一支党员突击队","date":"2021-08-28 11:13:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828111334633406061.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111334_b6cf0de28ba30b477310de86a79609b2_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111334_b6cf0de28ba30b477310de86a79609b2_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111334_b6cf0de28ba30b477310de86a79609b2_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"dffac76ff31bd28d50d89a490d815f2c","title":"同一路段、同一时段、同一辆面包车、同一违法行为","date":"2021-08-28 11:13:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828111329757640875.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111329_9846742a8c4c85d1ce6fa4a7ec0fc0a7_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111329_9846742a8c4c85d1ce6fa4a7ec0fc0a7_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111329_9846742a8c4c85d1ce6fa4a7ec0fc0a7_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"e91313ae690f28a450779e057ca46864","title":"贩卖\u201c两卡\u201d窝点\u201c重建\u201d 复工不到一个月又被端！","date":"2021-08-28 11:11:00","category":"头条","author_name":"东北网","url":"https://mini.eastday.com/mobile/210828111129265194367.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111129_1aaae42d30f229af3d45df96454d2fc4_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111129_1aaae42d30f229af3d45df96454d2fc4_2_mwpm_03201609.jpeg","is_content":"1"}],"page":"1","pageSize":"30"}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * stat : 1
         * data : [{"uniquekey":"70976ec04725897453fbd8663dd45120","title":"莱西12岁男孩不慎溺水，警民合力成功施救","date":"2021-08-28 11:27:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828112723110306437.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112723_45530b27834b90284a57f47499e753e6_1_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"a6a7679384de05a6db449f03539d4d81","title":"四川广元：农商银行员工赵某从噩梦中惊醒","date":"2021-08-28 11:27:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828112720186668978.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112720_3bc10c8d15f0463cbe45759f579e6ad3_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112720_3bc10c8d15f0463cbe45759f579e6ad3_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112720_3bc10c8d15f0463cbe45759f579e6ad3_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"56091b094350b762f3bdbdb880d6b632","title":"融安县公安局大将派出所拟招聘3名辅警人员","date":"2021-08-28 11:27:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828112717951639327.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112717_2579648ed1a3e9dd81b95d2f7798c445_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112717_2579648ed1a3e9dd81b95d2f7798c445_2_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"589f87309494d833d038fd631a874ca4","title":"靠喝脏水续命，郑州暴雨被困车库4天3夜男子出院回忆：\u201c放弃很简单 我妻子怎么办？\u201d","date":"2021-08-28 11:27:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828112710150404583.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112710_98aa67ebc417f942e7960017864dff3e_1_mwpm_03201609.png","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112710_98aa67ebc417f942e7960017864dff3e_2_mwpm_03201609.png","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112710_98aa67ebc417f942e7960017864dff3e_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"570d47bae50f279005ffbee58be47064","title":"神童张易文，10岁读大学，如今月薪两千他经历了什么？","date":"2021-08-28 11:27:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828112710112468229.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112710_fa27f35d071a328f346301c560b56eaa_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112710_fa27f35d071a328f346301c560b56eaa_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112710_fa27f35d071a328f346301c560b56eaa_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"74d762040efcae8c9159b655115451f8","title":"健身房关门跑路预付费难退，多方协调联盟成员援手续课程","date":"2021-08-28 11:20:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828112038674551000.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112038_9b0a32d6347650af9665222eeebe83e6_1_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"9624c2d340067d69ceef7d1e92e349d6","title":"苦劝8小时，南昌女警花成功止损14万","date":"2021-08-28 11:20:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828112038494619273.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112038_cbf4194a40f86632e60df1fa562e5a93_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112038_cbf4194a40f86632e60df1fa562e5a93_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112038_cbf4194a40f86632e60df1fa562e5a93_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"1c281cce1db2298b7575159cc9b70bfc","title":"在最后一段时光里，他们\u201c让逝者有尊严，让生者无遗憾\u201d","date":"2021-08-28 11:20:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828112037782841064.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112037_364f72e4bdb8227a9af6c65ea78189aa_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112037_364f72e4bdb8227a9af6c65ea78189aa_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112037_364f72e4bdb8227a9af6c65ea78189aa_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"386018c95214c1df2c613f8134f83670","title":"大连一高层公寓突发大火，外墙保温材料着火脱落，818名居民免费入住酒店","date":"2021-08-28 11:20:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828112036053110515.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112036_0dd7e17bce1e796a2d8bd31a89c8ff9a_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112036_0dd7e17bce1e796a2d8bd31a89c8ff9a_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112036_0dd7e17bce1e796a2d8bd31a89c8ff9a_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"8a8c5d2c766df335d47172bec1f28721","title":"事发乐平！废铁、铜线失窃，警方一看监控：眼熟！","date":"2021-08-28 11:20:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828112035522963167.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112035_5e628a74d53ddc31488cc7bb88158d70_2_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112035_5e628a74d53ddc31488cc7bb88158d70_3_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112035_5e628a74d53ddc31488cc7bb88158d70_4_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"513f253cdb3ba318b29cb06c0bc45dad","title":"看！这个边境派出所又来锦旗了","date":"2021-08-28 11:20:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828112033746794331.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112033_e26930ded639530d8414b365c7c9e605_1_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"7579e96821c444428798046e399be7c2","title":"唐山这些身影，很有young！","date":"2021-08-28 11:20:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828112033416658508.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112033_10e343b8ef51a89acbb4de26675eff2c_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112033_10e343b8ef51a89acbb4de26675eff2c_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112033_10e343b8ef51a89acbb4de26675eff2c_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"603654ee48131849753a8b6a5a1fb3dd","title":"上游评论：校园不让带手机却允许商家卖手机 校长免职后更要追责商家不当竞争","date":"2021-08-28 11:20:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828112033383292613.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112033_29230ab2c8f74e0d248ee56c7d3fcbb4_1_mwpm_03201609.png","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112033_29230ab2c8f74e0d248ee56c7d3fcbb4_2_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"cdea9c40979804685de9c7dac464cc9b","title":"一小车撞断隔离护栏！雨天路滑驾车需谨慎","date":"2021-08-28 11:20:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828112027354999362.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112027_559692925ff4af2cf4b67917b014439a_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112027_559692925ff4af2cf4b67917b014439a_2_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"a39ca8abb804b3b09e2e2071f882c0c3","title":"农民工在城市打工，干活一天两三百元工资为什么到月底还是没钱？","date":"2021-08-28 11:20:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828112026562817751.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112026_f1c55270a024b3c953ac6316b9721c18_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112026_f1c55270a024b3c953ac6316b9721c18_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112026_f1c55270a024b3c953ac6316b9721c18_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"7b74c1170811bc67c31a066fd7cda6f5","title":"53万人装上\u201c反诈神器\u201d，东昌府区电信诈骗发案率降了50%","date":"2021-08-28 11:20:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828112024444229982.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112024_9dddd97defd7b4bbcefcccf6baa28683_1_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"91b3d7acf987e1675fa420a7eeced39a","title":"\"敌敌畏\"杀蚊子！男子欲带剧毒农药上火车被行拘","date":"2021-08-28 11:20:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828112023926670526.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112023_f1cfe935c71e74f48393240e54fa144f_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112023_f1cfe935c71e74f48393240e54fa144f_2_mwpm_03201609.png","is_content":"1"},{"uniquekey":"b8af6142a858199f3b6693db927c49c7","title":"八旬老人致信点赞中国光大银行烟台蓬莱支行周到服务","date":"2021-08-28 11:20:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828112020661576879.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112020_e2b653d6ca514e24296a2e70e1d28baa_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112020_e2b653d6ca514e24296a2e70e1d28baa_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112020_e2b653d6ca514e24296a2e70e1d28baa_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"cfdef07f2fb3d995d34c7f173dd112cf","title":"一天接三锦旗，官桥派出所破案追赃感动受害人","date":"2021-08-28 11:20:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828112016510157841.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112016_43238000fdf136468c7b36811458b3c6_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112016_43238000fdf136468c7b36811458b3c6_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210828/20210828112016_43238000fdf136468c7b36811458b3c6_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"1930a8bfc4004cb65ae4e3fbe8c72bf1","title":"密云一农用三轮车侧翻，5人被困河道！救援冲锋舟出动！","date":"2021-08-28 11:14:00","category":"头条","author_name":"北京日报","url":"https://mini.eastday.com/mobile/210828111415319234890.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111415_da4646d73815be1e34ffe25dceab0ef5_1_mwpm_03201609.png","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111415_da4646d73815be1e34ffe25dceab0ef5_2_mwpm_03201609.png","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111415_da4646d73815be1e34ffe25dceab0ef5_3_mwpm_03201609.png","is_content":"1"},{"uniquekey":"0246cd8cecd11409c6529a328eef7432","title":"自称王某文妻子者替丈夫辩护，如事有反转，王某文是否可反诉周某","date":"2021-08-28 11:13:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828111352061689032.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111352_5e3ba9f568c8797242b4797bb350badd_1_mwpm_03201609.png","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111352_5e3ba9f568c8797242b4797bb350badd_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111352_5e3ba9f568c8797242b4797bb350badd_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"5e7061ac2fb80b4ced7194f5f869a3f6","title":"这是什么操作？有人邮递液化气罐24个入境，海关：均属危险化学品","date":"2021-08-28 11:13:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828111351102612134.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111351_fcac7b277e0d8826f15bb459211cc4e6_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111351_fcac7b277e0d8826f15bb459211cc4e6_2_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"6f421f632e1a5c5a00ccc9e08ba2d90d","title":"宅基地制度改革中！2点变化村民无法避免，早点做好心理准备","date":"2021-08-28 11:13:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828111350792937175.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111350_0464609c6be631b0ea3ebefe56cf06b1_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111350_0464609c6be631b0ea3ebefe56cf06b1_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111350_0464609c6be631b0ea3ebefe56cf06b1_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"929ab531267494ba5871bd696edc0e5f","title":"因为卸载了一款APP，银行职工被骗30余万\u2026\u2026","date":"2021-08-28 11:13:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828111346487945563.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111346_726da5b9ef306030ebf7ea8851c30373_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111346_726da5b9ef306030ebf7ea8851c30373_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111346_726da5b9ef306030ebf7ea8851c30373_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"f12841157919514da57ba72882a5b4be","title":"成都市聋协副主席罗小玮：用手语为聋人架起与外界沟通的桥梁","date":"2021-08-28 11:13:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828111341388388393.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111341_0ba20ef895304919769c9616adc10861_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111341_0ba20ef895304919769c9616adc10861_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111341_0ba20ef895304919769c9616adc10861_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"8637a90c5772ef0c72e24da28ca0465f","title":"通过120次沟通法官帮当事人拿到71万丨我为群众办实事","date":"2021-08-28 11:13:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828111338070808406.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111338_e18a36c05ad82288a718c99671144166_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111338_e18a36c05ad82288a718c99671144166_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111338_e18a36c05ad82288a718c99671144166_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"731a1a192d5cf7cc5222fe08700398ac","title":"拿毛巾给车牌\u201c降温\u201d？这操作也太野了吧","date":"2021-08-28 11:13:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828111337086878993.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111337_49ef0f24546eaacb871d32a2bdb38374_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111337_49ef0f24546eaacb871d32a2bdb38374_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111337_49ef0f24546eaacb871d32a2bdb38374_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"ef730845066fe9a271bd890edf9ec2ad","title":"铁路上，有这样一支党员突击队","date":"2021-08-28 11:13:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828111334633406061.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111334_b6cf0de28ba30b477310de86a79609b2_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111334_b6cf0de28ba30b477310de86a79609b2_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111334_b6cf0de28ba30b477310de86a79609b2_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"dffac76ff31bd28d50d89a490d815f2c","title":"同一路段、同一时段、同一辆面包车、同一违法行为","date":"2021-08-28 11:13:00","category":"头条","author_name":"人民资讯","url":"https://mini.eastday.com/mobile/210828111329757640875.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111329_9846742a8c4c85d1ce6fa4a7ec0fc0a7_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111329_9846742a8c4c85d1ce6fa4a7ec0fc0a7_2_mwpm_03201609.jpeg","thumbnail_pic_s03":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111329_9846742a8c4c85d1ce6fa4a7ec0fc0a7_3_mwpm_03201609.jpeg","is_content":"1"},{"uniquekey":"e91313ae690f28a450779e057ca46864","title":"贩卖\u201c两卡\u201d窝点\u201c重建\u201d 复工不到一个月又被端！","date":"2021-08-28 11:11:00","category":"头条","author_name":"东北网","url":"https://mini.eastday.com/mobile/210828111129265194367.html","thumbnail_pic_s":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111129_1aaae42d30f229af3d45df96454d2fc4_1_mwpm_03201609.jpeg","thumbnail_pic_s02":"https://dfzximg02.dftoutiao.com/news/20210828/20210828111129_1aaae42d30f229af3d45df96454d2fc4_2_mwpm_03201609.jpeg","is_content":"1"}]
         * page : 1
         * pageSize : 30
         */

        private String stat;
        private String page;
        private String pageSize;
        private List<DataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public String getPage() {
            return page;
        }

        public void setPage(String page) {
            this.page = page;
        }

        public String getPageSize() {
            return pageSize;
        }

        public void setPageSize(String pageSize) {
            this.pageSize = pageSize;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * uniquekey : 70976ec04725897453fbd8663dd45120
             * title : 莱西12岁男孩不慎溺水，警民合力成功施救
             * date : 2021-08-28 11:27:00
             * category : 头条
             * author_name : 人民资讯
             * url : https://mini.eastday.com/mobile/210828112723110306437.html
             * thumbnail_pic_s : https://dfzximg02.dftoutiao.com/news/20210828/20210828112723_45530b27834b90284a57f47499e753e6_1_mwpm_03201609.jpeg
             * is_content : 1
             * thumbnail_pic_s02 : https://dfzximg02.dftoutiao.com/news/20210828/20210828112720_3bc10c8d15f0463cbe45759f579e6ad3_2_mwpm_03201609.jpeg
             * thumbnail_pic_s03 : https://dfzximg02.dftoutiao.com/news/20210828/20210828112720_3bc10c8d15f0463cbe45759f579e6ad3_3_mwpm_03201609.jpeg
             */

            private String uniquekey;
            private String title;
            private String date;
            private String category;
            private String author_name;
            private String url;
            private String thumbnail_pic_s;
            private String is_content;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getIs_content() {
                return is_content;
            }

            public void setIs_content(String is_content) {
                this.is_content = is_content;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }

            @Override
            public String toString() {
                return "DataBean{" +
                        "uniquekey='" + uniquekey + '\'' +
                        ", title='" + title + '\'' +
                        ", date='" + date + '\'' +
                        ", category='" + category + '\'' +
                        ", author_name='" + author_name + '\'' +
                        ", url='" + url + '\'' +
                        ", thumbnail_pic_s='" + thumbnail_pic_s + '\'' +
                        ", is_content='" + is_content + '\'' +
                        ", thumbnail_pic_s02='" + thumbnail_pic_s02 + '\'' +
                        ", thumbnail_pic_s03='" + thumbnail_pic_s03 + '\'' +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "ResultBean{" +
                    "stat='" + stat + '\'' +
                    ", page='" + page + '\'' +
                    ", pageSize='" + pageSize + '\'' +
                    ", data=" + data +
                    '}';
        }
    }
}
