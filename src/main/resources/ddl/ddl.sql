#mysql数据库ddl--测试jpa多对多部分
create table test_user(
user_id Integer auto_increment not null primary key,
user_name varchar(40),
user_account varchar(40));
create table test_role(
role_id Integer auto_increment not null  primary key,
role_name varchar(40),
role_no varchar(40));
create table test_user_role(
user_role_id Integer auto_increment not null primary key,
user_id Integer,
role_id Integer
);

#Vue 后台所需表格
create table vue_brand(
brand_id Integer auto_increment not null primary key,
brand_name varchar(100),
brand_create_time timestamp
);
--vue-cms前端项目对应的图片表
--image_category_id图片所属分类
--image_category_object_id图片所属分类下的对象
--image_category_show_flag图片所属分类是否在图片分享中显示
create table vue_Images(
image_id Integer auto_increment not null primary key,
image_name varchar(100),
image_path varchar(100),
image_title varchar(200),
image_content text,
image_category_id Integer,
image_category_object_id Integer,
image_category_show_flag char(1),
image_create_time timestamp default current_timestamp,
image_view_time Integer
);
--初始化前端项目对应的轮播图表(vscode中发布的网络图片)
insert into vue_Images(image_name,image_path,image_title,image_content,image_category_id,image_category_object_id,image_category_show_flag,image_create_time,image_view_time) values('1.jpg','http://192.168.1.3:3000/images/1.jpg','vue轮播图-1.jpg','vue轮播图-1.jpg',2,-1,'N',current_timestamp,5);
insert into vue_Images(image_name,image_path,image_title,image_content,image_category_id,image_category_object_id,image_category_show_flag,image_create_time,image_view_time) values('beach.jpg','http://192.168.1.3:3000/images/beach.jpg','沙滩','金沙滩之夏，在蓝天下，在阳光里，构成岛城夏季光亮迷人的一道绝景的五彩太阳伞、蒙古包、帐篷及救生泳具沿海岸星罗棋布。游人或租一顶太阳伞遮阳、小憩，谈笑风生；或举家躺卧沙滩上，享受这别具情趣的日光浴；或到近海中游泳，或乘摩托艇穿行在海面上。一把五彩的太阳伞就好像一把浪漫、一手情趣和一种氛围，不知不觉地深植于旅人的心田。也许不曾想过浪漫是什么，浪漫就那么不经意地来到了我们身边。脚踏细沙，眼看大海！晨风照面，舒爽怡人；海味入鼻，直动心灵。白浪横接天地，卷卷而来，翻腾叠起，煞是有威。错落小岛，迫人遐想无穷；游艇飞梭，引动游人心绪。',2,-1,'N',current_timestamp,5);
insert into vue_Images(image_name,image_path,image_title,image_content,image_category_id,image_category_object_id,image_category_show_flag,image_create_time,image_view_time) values('tuijian.jpg','http://192.168.1.3:3000/images/tuijian.jpg','雪山','云杉坪是一块广阔的草坪，种着杉树，许多牦牛在这里散步。从甘海子去云杉坪之间，有一条深幽的山谷，谷内林木森森，清溪长流，谷底这个清泉长流的河，就是白水河。白水河之水源于四五千米高处的冰川雪原融水，清洌冰凉，遇尔还见到牦牛在这冰冷刺骨的水里洗澡，白水河河床上的石头层层叠叠，像千层酥，又像紫鹊界的梯田。雪山，冰川，耀眼的阳光，没事儿溜达的牦牛，青灰色的岩石，隐隐约约可以听到冰河的咕咕声，雄浑的群山，连绵没有尽头，山顶埋在大雾中，让人望眼欲穿，分不清云层和皑皑白雪，这一切组成了一幅仙境般的画面。',3,-1,'Y',current_timestamp,6);
insert into vue_Images(image_name,image_path,image_title,image_content,image_category_id,image_category_object_id,image_category_show_flag,image_create_time,image_view_time) values('redian.jpg','http://192.168.1.3:3000/images/redian.jpg','《终结者：黑暗命运》','《终结者：黑暗命运》是T-800战斗最激烈壮阔、最为夸张的一次，他不仅是队伍的精神领袖，也是几位女性角色的后盾，戴上墨镜象征着他往昔英勇的回归，他们从高速公路打到空中对撞的“银河C5”运输机，再到水坝的涡轮大厅。一个是公认的“无法战胜的敌人”，一个外表年迈却仍旧是地球最强的战士，这次的故事将是施瓦辛格和汉密尔顿的终极一战。',4,-1,'Y',current_timestamp,3);
insert into vue_Images(image_name,image_path,image_title,image_content,image_category_id,image_category_object_id,image_category_show_flag,image_create_time,image_view_time) values('beijing.jpg','http://192.168.1.3:3000/images/beijing.jpg','北京天安门','隔着长安大街看天安门，白玉石须弥座上，三丈六尺高的抹红泥砖台，上面就是最醒目的城门楼。那庄严肃穆和高大稳固，令人顿生骄傲豪迈之情。',5,-1,'Y',current_timestamp,2);
insert into vue_Images(image_name,image_path,image_title,image_content,image_category_id,image_category_object_id,image_category_show_flag,image_create_time,image_view_time) values('shehui.jpg','http://192.168.1.3:3000/images/shehui.jpg','社会主义价值观','富强、民主、文明、和谐、自由、平等、公正、法治、爱国、敬业、诚信、友善、是社会主义核心价值观的内容。“富强、民主、文明、和谐”是我国社会主义现代化国家的建设目标，"自由、平等、公正、法治"是对美好社会的表述，“爱国、敬业、诚信、友善”是公民基本道德规范。',6,-1,'Y',current_timestamp,10);
insert into vue_Images(image_name,image_path,image_title,image_content,image_category_id,image_category_object_id,image_category_show_flag,image_create_time,image_view_time) values('yule.jpg','http://192.168.1.3:3000/images/yule.jpg','三生三世十里桃花','翼君擎苍向神族挑起战争，神族付出惨痛代价封印了擎苍，同年天孙夜华出世。七万年后擎苍破出封印，青丘狐帝幺女白浅再次将擎苍封印，因此被封法力、记忆和容貌，落入凡尘与夜华相识、相恋，后被带入天宫。天宫中，爱慕夜华的素锦屡次陷害白浅，并让白浅误会夜华冷酷无情，继而又害白浅被挖双眼。白浅伤心欲绝，产子后，纵身跃下诛仙台。因诛仙台戾气破解封印，她恢复记忆，为忘记夜华，饮下忘情药。百年后二人在东海重逢，夜华认出白浅，相随相伴，再续前缘，更唤醒白浅记忆。面对往日仇怨，白浅问素锦讨回双眼，怎料又中了素锦的计，再不肯原谅夜华。此时擎苍再次醒转，夜华来不及解释，亲自斩杀擎苍，付出生命封了东皇钟，面对魂飞魄散的夜华，白浅悔恨自责。幸而三年后，夜华苏醒，二人再续前缘。',7,-1,'Y',current_timestamp,4);
insert into vue_Images(image_name,image_path,image_title,image_content,image_category_id,image_category_object_id,image_category_show_flag,image_create_time,image_view_time) values('keji.jpg','http://192.168.1.3:3000/images/keji.jpg','星际穿越','在不远的未来，随着地球自然环境的恶化，人类面临着无法生存的威胁。这时科学家们在太阳系中的土星附近发现了一 个虫洞，通过它可以打破人类的能力限制，到更遥远外太空寻找延续生命希望的机会。一个探险小组通过这个虫洞穿越到太阳系之外，他们的目标是找到一颗适合人类移民的星球。在这艘名叫做“Endurance”的飞船上，探险队员着面临着前所未有，人类思想前所未及的巨大挑战。然而，通过虫洞后，他们发现飞船上在星球上的一个小时相当于地球上的七年时间，即使探险小组的任务能够完成，他们的救赎对于对地球上仍然活着的人来说已经是太晚。飞行员库珀必须在与自己的儿女重逢以及拯救人类的未来之间做出抉择',8,-1,'Y',current_timestamp,3);
--vue-cms前端项目对应的新闻资讯表
--news_title：新闻标题
--news_content：新闻内容
--news_image_path：新闻标题中图片的路径
--news_view_count：新闻查看的次数
create table vue_news(
news_id Integer auto_increment not null primary key,
news_title varchar(300),
news_content text,
news_image_path varchar(100),
news_view_count Integer,
news_created_by Integer default 2,
news_updated_by Integer default 2,
news_create_date timestamp default current_timestamp,
news_update_date timestamp);
);
--初始化前端项目对应的新闻资讯表
insert into vue_news(news_title,news_content,news_image_path,news_view_count,news_create_date,news_update_date)values('幸福','能和心爱的人一起睡觉，是件幸福的事情；可是，打呼噜怎么办？','http://192.168.1.3:3000/images/shuijiao.jpg',7,current_timestamp,current_timestamp);
insert into vue_news(news_title,news_content,news_image_path,news_view_count,news_create_date,news_update_date)values('木屋','想要这样一间小木屋，夏天挫冰吃瓜，冬天围炉取暖.','http://192.168.1.3:3000/images/muwu.jpg',4,current_timestamp,current_timestamp);
insert into vue_news(news_title,news_content,news_image_path,news_view_count,news_create_date,news_update_date)values('CBD','烤炉模式的城，到黄昏，如同打翻的调色盘一般.','http://192.168.1.3:3000/images/cbd.jpg',9,current_timestamp,current_timestamp);
insert into vue_news(news_title,news_content,news_image_path,news_view_count,news_create_date,news_update_date)values('广东省委书记李希到汕尾调研，走访万科帮扶项目','<p><br /></p><p style="color:#746969;text-align:justify;font-family:&quot;font-size:13px;">4月8日至9日，广东省委书记李希到汕尾市调研，深入红色革命遗址、革命老区乡村，就深入学习贯彻习近平总书记关于老区苏区工作重要论述，推动广东省老区苏区发展进行专题调研。</p><p style="color:#746969;text-align:justify;font-family:&quot;font-size:13px;">汕尾是全域革命老区，无数优秀海陆丰儿女为民族独立、人民解放作出了重大贡献和巨大牺牲。李希表示，要始终铭记光辉历史，传承红色基因，做好红色资源保护开发工作。李希深入陆丰市金厢镇下埔村、洲渚村，陆河县新田镇湖坑村、水唇镇螺洞村，与老党员、基层干部群众、企业驻村代表等深入交流，详细了解老区乡村振兴、群众生产生活情况。</p><p style="color:#746969;text-align:justify;font-family:&quot;font-size:13px;">在下埔村，万科驻村代表介绍了万科帮扶村里发展红色旅游、建设公共服务设施等情况。李希强调，要把乡村振兴各项举措落到实处，开展好“万企帮万村”行动，发展红色旅游、生态农业等富民兴村产业，抓好垃圾污水处理、“厕所革命”和村容村貌提升工作，以修订完善村规民约引领乡风文明，让老区人民的生活越过越好。</p><p style="color:#746969;text-align:justify;font-family:&quot;font-size:13px;">汕尾陆丰市金厢镇是由万科援建的乡村振兴项目，万科发扬自身规划、设计、建筑优势，通过对金厢镇一横一纵轴线上基础设施的提升，改造与保护并行。万科抓住海陆丰革命老区振兴和广东省全域旅游发展，整合金厢镇各类红色旅游资源，以周恩来居所纪念馆为切入，串联多个红色旅游景点；合理利用现有的空地、广场、公共建筑等空间，建设下埔标准11人足球场、村民活动中心、村民广场、儿童游乐广场、榕树广场等多个公共休闲运动空间。</p><p style="color:#746969;text-align:justify;font-family:&quot;font-size:13px;">金厢镇项目于2018年6月立项，8月份万科即入驻，10月开工建设并有序推进。项目预计一期工程2019年4月交付，二期工程2019年年底交付。</p><p style="color:#746969;text-align:justify;font-family:&quot;font-size:13px;"><img src="http://192.168.1.3:3000/images/wanke_1.jpg" /> </p><p style="color:#746969;text-align:justify;font-family:&quot;font-size:13px;">万科第五城：A户型， 3室2厅2卫1厨， 建筑面积约93.00平米</p><p style="color:#746969;text-align:justify;font-family:&quot;font-size:13px;"><img src="http://192.168.1.3:3000/images/wanke_2.jpg" /> </p><p style="color:#746969;text-align:justify;font-family:&quot;font-size:13px;">万科第五城：B户型， 4室2厅2卫1厨， 建筑面积约116.00平米</p>','http://192.168.1.3:3000/images/cbd.jpg',9,current_timestamp,current_timestamp);
--vue-cms前端项目对应的评论表
--comment_user_id 评论人
--comment_message评论内容
--comment_module评论模块
--comment_module_id评论所属对象
--comment_level好评3/中评2/差评1
--comment_create_time评论时间
--comment_is_work评论是否生效
create table vue_comments(
comment_id Integer auto_increment not null primary key,
comment_user_id Integer default 2,
comment_message varchar(240),
comment_module varchar(20),
comment_module_id Integer,
comment_level char(1) default '3',
comment_create_time timestamp,
comment_is_work char(1) default 'Y' 
);
--初始化一些评论数据
insert into vue_comments(comment_message,comment_module,comment_module_id,comment_create_time)values('后端接口查询出来的评论数据啊','news',2,current_timestamp);
insert into vue_comments(comment_message,comment_module,comment_module_id,comment_create_time)values('老夫撸代码从来不管什么框架理论，抄起键盘就是Ctrl+C/V,不服来战','news',2,current_timestamp);
insert into vue_comments(comment_message,comment_module,comment_module_id,comment_create_time)values('后端接口查询出来的评论数据啊','news',13,current_timestamp);
insert into vue_comments(comment_message,comment_module,comment_module_id,comment_create_time)values('老夫撸代码从来不管什么框架理论，抄起键盘就是Ctrl+C/V,不服来战','news',13,current_timestamp);
--图片分享模块里的图片类别
create table vue_image_category(
image_category_id Integer auto_increment not null primary key,
image_category_name varchar(40),
image_category_code varchar(10),
image_category_show_flag char(1) default 'Y'
);
--初始化6个图片类别
insert into vue_image_category(image_category_id,image_category_name,image_category_code,image_category_show_flag)values(2,'轮播','lunbo','N');
insert into vue_image_category(image_category_id,image_category_name,image_category_code,image_category_show_flag)values(3,'推荐','recommend','Y');
insert into vue_image_category(image_category_id,image_category_name,image_category_code,image_category_show_flag)values(4,'热点','hotspot','Y');
insert into vue_image_category(image_category_id,image_category_name,image_category_code,image_category_show_flag)values(5,'北京','beijng','Y');
insert into vue_image_category(image_category_id,image_category_name,image_category_code,image_category_show_flag)values(6,'社会','society','Y');
insert into vue_image_category(image_category_id,image_category_name,image_category_code,image_category_show_flag)values(7,'娱乐','amusement','Y');
insert into vue_image_category(image_category_id,image_category_name,image_category_code,image_category_show_flag)values(8,'科技','technology','Y');
insert into vue_image_category(image_category_id,image_category_name,image_category_code,image_category_show_flag)values(9,'商品','goods','N');
--商品基础信息
create table vue_goods_basic(
goods_id Integer auto_increment not null primary key,
goods_title varchar(300),
goods_number varchar(40),
goods_basic_info varchar(1000),
goods_view_time Integer,
goods_image_path varchar(100),
goods_sell_price decimal(14,4),
goods_market_price decimal(14,4),
goods_stock_quantity Integer,
goods_enable_flag char(1),
goods_create_time timestamp default current_timestamp
);
--初始化测试数据
insert into vue_goods_basic(goods_title,goods_number,goods_basic_info,goods_view_time,goods_image_path,goods_sell_price,goods_market_price,goods_stock_quantity,goods_enable_flag,goods_create_time)values('【分期免息】Apple/苹果 iPhone X 苹果x手机国行iphonex全网通4G','APPLEX001','【分期免息】Apple/苹果 iPhone X 苹果x手机国行iphonex全网通4G',28,'http://192.168.1.3:3000/images/goods/cellphone/iphoneX.webp',3650.00,4000.00,60,'Y',current_timestamp);
insert into vue_goods_basic(goods_title,goods_number,goods_basic_info,goods_view_time,goods_image_path,goods_sell_price,goods_market_price,goods_stock_quantity,goods_enable_flag,goods_create_time)values('【12期免息】Huawei/华为Mate 30 Pro 5G麒麟990徕卡四摄5G芯片智能手机','HUAWEIMATE30PRO001','【12期免息】Huawei/华为Mate 30 Pro 5G麒麟990徕卡四摄5G芯片智能手机',42,'http://192.168.1.3:3000/images/goods/cellphone/huaweiMate30Pro.webp',6899.00,7000.00,30,'Y',current_timestamp);
insert into vue_goods_basic(goods_title,goods_number,goods_basic_info,goods_view_time,goods_image_path,goods_sell_price,goods_market_price,goods_stock_quantity,goods_enable_flag,goods_create_time)values('ThinkPad X390 因特尔酷睿四核i5/i7 联想13.3英寸笔记本电脑2019新品 轻薄便携商务本','THINKPADx390001','ThinkPad X390 因特尔酷睿四核i5/i7 联想13.3英寸笔记本电脑2019新品 轻薄便携商务本',22,'http://192.168.1.3:3000/images/goods/computer/ThinkPadX390.webp',6699.00,6900.00,25,'Y',current_timestamp);
insert into vue_goods_basic(goods_title,goods_number,goods_basic_info,goods_view_time,goods_image_path,goods_sell_price,goods_market_price,goods_stock_quantity,goods_enable_flag,goods_create_time)values('【35周年感恩有你】联想小新Pro13 13.3英寸超轻薄笔记本电脑','LENOVOPRO13001','【35周年感恩有你】联想小新Pro13 13.3英寸超轻薄笔记本电脑',40,'http://192.168.1.3:3000/images/goods/computer/xiaoxinPro13.webp',5199.00,5400.00,32,'Y',current_timestamp);
insert into vue_goods_basic(goods_title,goods_number,goods_basic_info,goods_view_time,goods_image_path,goods_sell_price,goods_market_price,goods_stock_quantity,goods_enable_flag,goods_create_time)values('石头扫地机器人T4 家用激光导航全自动无线超薄清洁吸尘器T6 SE','STONECLEANER001','石头扫地机器人T4 家用激光导航全自动无线超薄清洁吸尘器T6 SE',100,'http://192.168.1.3:3000/images/goods/cleaner/cleaner_1.webp',1699.00,2000.00,32,'Y',current_timestamp);
insert into vue_goods_basic(goods_title,goods_number,goods_basic_info,goods_view_time,goods_image_path,goods_sell_price,goods_market_price,goods_stock_quantity,goods_enable_flag,goods_create_time)values('美国智能扫地机器人家用全自动扫拖一体擦地机充电进口超薄吸尘器','AICLENAER001','美国智能扫地机器人家用全自动扫拖一体擦地机充电进口超薄吸尘器',79,'http://192.168.1.3:3000/images/goods/cleaner/cleaner_2.webp',2388.00,2600.00,38,'Y',current_timestamp);
insert into vue_goods_basic(goods_title,goods_number,goods_basic_info,goods_view_time,goods_image_path,goods_sell_price,goods_market_price,goods_stock_quantity,goods_enable_flag,goods_create_time)values('【买2盒送1盒】麻辣小龙虾尾350g熟食包邮即食非罐装香辣口味虾球','XIAOLONGXIA001','【买2盒送1盒】麻辣小龙虾尾350g熟食包邮即食非罐装香辣口味虾球',67,'http://192.168.1.3:3000/images/goods/food/xiaolongxia_1.webp',49.80,82.00,82,'Y',current_timestamp);
insert into vue_goods_basic(goods_title,goods_number,goods_basic_info,goods_view_time,goods_image_path,goods_sell_price,goods_market_price,goods_stock_quantity,goods_enable_flag,goods_create_time)values('【买2送1】麻辣小龙虾尾海鲜熟食即食非罐装香辣味虾球零食十三香','XIAOLONGXIA002','【买2送1】麻辣小龙虾尾海鲜熟食即食非罐装香辣味虾球零食十三香',43,'http://192.168.1.3:3000/images/goods/food/xiaolongxia_2.webp',48.80,80.00,38,'Y',current_timestamp);
insert into vue_goods_basic(goods_title,goods_number,goods_basic_info,goods_view_time,goods_image_path,goods_sell_price,goods_market_price,goods_stock_quantity,goods_enable_flag,goods_create_time)values('4份均价49.9_红小厨麻辣小龙虾鲜活烧制熟食十三香香辣味50-34只','XIAOLONGXIA003','4份均价49.9_红小厨麻辣小龙虾鲜活烧制熟食十三香香辣味50-34只',102,'http://192.168.1.3:3000/images/goods/food/xiaolongxia_3.webp',119.90,320.00,82,'Y',current_timestamp);
insert into vue_goods_basic(goods_title,goods_number,goods_basic_info,goods_view_time,goods_image_path,goods_sell_price,goods_market_price,goods_stock_quantity,goods_enable_flag,goods_create_time)values('虾伯伯潜江油焖小龙虾熟食即食麻辣味蒜蓉味虾零食鲜活净虾6-8钱','XIAOLONGXIA004','虾伯伯潜江油焖小龙虾熟食即食麻辣味蒜蓉味虾零食鲜活净虾6-8钱',31,'http://192.168.1.3:3000/images/goods/food/xiaolongxia_4.webp',179.00,220.00,182,'Y',current_timestamp);
insert into vue_goods_basic(goods_title,goods_number,goods_basic_info,goods_view_time,goods_image_path,goods_sell_price,goods_market_price,goods_stock_quantity,goods_enable_flag,goods_create_time)values('公牛充满自动断电插座智能防过充魔方带usb充电器X苹果11手机XR小米多功能插板','GONGNIU002','公牛充满自动断电插座智能防过充魔方带usb充电器X苹果11手机XR小米多功能插板',62,'http://192.168.1.3:3000/images/goods/tool/chaxianban_2.webp',1490,200.00,182,'Y',current_timestamp);
insert into vue_goods_basic(goods_title,goods_number,goods_basic_info,goods_view_time,goods_image_path,goods_sell_price,goods_market_price,goods_stock_quantity,goods_enable_flag,goods_create_time)values('公牛插座面板多孔一转多插头转换器无线多功能扩展电源插线板插排','GONGNIU001','公牛插座面板多孔一转多插头转换器无线多功能扩展电源插线板插排',62,'http://192.168.1.3:3000/images/goods/tool/chaxianban_1.webp',15.90,22.00,182,'Y',current_timestamp);
--给每个商品添加一个缩略图(执行两次，给每个商品添加两张图查看明细页面轮播效果)
insert into vue_Images(image_name,image_path,image_title,image_content,image_category_id,image_category_object_id,image_category_show_flag,image_create_time,image_view_time)select goods_number,goods_image_path,goods_title,goods_title,9,goods_id,'N',current_timestamp,10 from vue_goods_basic;

--商品详情表
create table vue_goods_detail(
goods_detail_id Integer auto_increment not null primary key,
goods_id Integer,
goods_title varchar(300),
goods_detail_info text
);


