create database springboot_project;
use springboot_project;
create table goods_class
(
    id         int auto_increment comment '类别编号'
        primary key,
    class_name varchar(255) null comment '商品类别',
    object     varchar(255) null comment '消费对象',
    rival      varchar(255) null comment '竞争对手',
    means      varchar(255) null comment '传播手段'
)
    charset = utf8;

create table goods_manage
(
    id             int auto_increment comment '进货编号'
        primary key,
    goods_name     varchar(255) null comment '货品名称',
    goods_class_id int          null comment '所属类别',
    channel        varchar(255) null comment '进货渠道',
    number         int          null comment '数量',
    price          varchar(255) null comment '单价',
    stock_time     varchar(255) null comment '进货时间',
    put_time       varchar(255) null comment '入库时间',
    states         varchar(255) null comment '当前状态',
    constraint goods_manage_class_fk
        foreign key (goods_class_id) references goods_class (id)
)
    charset = utf8;

create table user
(
    id         int auto_increment comment '编号'
        primary key,
    username   varchar(50) not null comment '账户名',
    userpwd    varchar(50) not null comment '密码',
    email      varchar(50) null comment '电子邮箱',
    createdate date        null comment '注册时间',
    userstatus int         null comment '用户状态（1启用 0禁用）',
    role       int         null comment '用户权限（1普通用户 0管理员）'
)
    charset = utf8;