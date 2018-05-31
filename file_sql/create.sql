drop table IF EXISTS product_info;
create table product_info (
  -- 工业级不适用自增,避免上限影响
  product_id VARCHAR(32) NOT NULL,
  product_name VARCHAR(64) NOT NULL COMMENT '商品名称',
  product_price DECIMAL(8,2) NOT NULL COMMENT '商品价格',
  -- 8指定指定小数点左边和右边可以存储的十进制数字的最大个数,最大精度38
  -- 2指定小数点右边可以存储的十进制数字的最大个数，小数位数必须是从 0 到 a之间的值，默认小数位数是 0
  product_stock int NOT NULL COMMENT '库存',
  product_descprition VARCHAR(64) COMMENT '描述',
  product_icon VARCHAR(1024) COMMENT '小图',
  product_status TINYINT(3) NOT NULL DEFAULT 0 COMMENT '商品状态,0正常1下架',
  category_type int NOT NULL COMMENT '类目编号',
  create_time TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '创建时间',
  update_time TIMESTAMP NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '修改时间',
  -- timestamp 支持默认值及自动修改更新时间
  PRIMARY KEY (product_id)
) COMMENT '商品表';


drop table IF EXISTS product_category;
create table product_category (
  category_id int NOT NULL AUTO_INCREMENT,
  category_name VARCHAR(64) COMMENT '类目名',
  category_type int NOT NULL COMMENT '类目编号',
  create_time TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '创建时间',
  update_time TIMESTAMP NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '修改时间',
  PRIMARY KEY (category_id),
  UNIQUE KEY unique_category_type (category_type)
  -- 唯一索引列的值必须唯一，但同意有空值
) COMMENT '类目表';

drop table IF EXISTS order_master;
create table order_master (
  order_id VARCHAR(32) NOT NULL,
  buyer_name VARCHAR(64) NOT NULL COMMENT '买家名字',
  buyer_phone VARCHAR(32) NOT NULL COMMENT '买家电话',
  buyer_address VARCHAR(128) COMMENT '买家地址',
  buyer_openid VARCHAR(64) NOT NULL COMMENT '买家微信openid',
  order_amount DECIMAL(8,2) NOT NULL COMMENT '订单总金额',
  order_status TINYINT(3) NOT NULL DEFAULT 0 COMMENT '订单状态,默认0为新下单',
  pay_status TINYINT(3) NOT NULL DEFAULT 0 COMMENT '支付状态,默认0为未支付',
  create_time TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '创建时间',
  update_time TIMESTAMP NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '修改时间',
  PRIMARY KEY (order_id),
  KEY index_buyer_openid (buyer_openid)
) COMMENT '订单表';

drop table IF EXISTS order_detail;
create table order_detail (
  detail_id VARCHAR(32) NOT NULL ,
  order_id VARCHAR(32) NOT NULL ,
  product_id VARCHAR(32) NOT NULL ,
  product_name VARCHAR(64) NOT NULL COMMENT '商品名称',
  product_price DECIMAL(8,2) NOT NULL COMMENT '商品价格',
  product_quantity int NOT NULL COMMENT '商品数量',
  product_icon VARCHAR(1024) COMMENT '小图',
  create_time TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '创建时间',
  update_time TIMESTAMP NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '修改时间',
  PRIMARY KEY (detail_id),
  key index_order_id (order_id)
) COMMENT '订单详情表';