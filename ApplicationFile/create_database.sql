create
database suaxeluudong;
use
suaxeluudong;

create table quyen
(
    quyenid  bigint       not null primary key auto_increment,
    tenquyen varchar(255) not null
);
create table taikhoan
(
    taikhoanid bigint       not null primary key auto_increment,
    username   varchar(255) not null,
    password   varchar(255) not null,
    quyenid    bigint       not null
);

create table dichvu
(
    dichvuid bigint       not null primary key auto_increment,
    tendv    varchar(100) not null,
    loaixeid bigint       not null
);

create table loaixe
(
    loaixeid bigint       not null primary key auto_increment,
    tenxe    varchar(255) not null
);

create table khachhang
(
    khachhangid bigint not null primary key auto_increment,
    tenkh       varchar(255),
    diachi      varchar(255),
    sdt         varchar(50),
    ngaythamgia timestamp,
    taikhoanid  bigint not null
);

create table doitac
(
    doitacid    bigint       not null primary key auto_increment,
    tendt       varchar(255) not null,
    diachi      varchar(255),
    sdt         varchar(50),
    ngaythamgia timestamp,
    taikhoanid  bigint       not null
);
create table chitietdichvu
(
    chitietdvid     bigint not null primary key auto_increment,
    soluong         int    not null,
    dongia          float  not null,
    tienphatsinh    float,
    chitietphatsinh varchar(255),
    thanhtoanid     bigint not null,
    dichvuid        bigint not null,
    doitacid        bigint not null
);

create table thanhtoan
(
    thanhtoanid bigint not null primary key auto_increment,
    ngay        timestamp,
    tongtien    float,
    khachhangid bigint not null
);


create table hotrotructuyen
(
    hotroid     bigint not null primary key auto_increment,
    ngay        timestamp,
    noidung     text,
    phanhoi     text,
    khachhangid bigint not null
);
create table danhgia
(
    danhgiaid   bigint not null primary key auto_increment,
    diem        int,
    binhluan    text,
    khachhangid bigint not null,
    doitacid    bigint not null
);
create table doitac_dichvu
(
    id       bigint not null primary key auto_increment,
    doitacid bigint not null,
    dichvuid bigint not null
);

alter table taikhoan
    add constraint fk_taikhoan_quyen foreign key (quyenid) references quyen (quyenid);
alter table khachhang
    add constraint fk_khachhang_taikhoan foreign key (taikhoanid) references taikhoan (taikhoanid);
alter table doitac
    add constraint fk_doitac_taikhoan foreign key (taikhoanid) references taikhoan (taikhoanid);
alter table doitac_dichvu
    add constraint fk_doitacdichvu_doitac foreign key (doitacid) references doitac (doitacid);
alter table doitac_dichvu
    add constraint fk_doitacdichvu_dichvu foreign key (dichvuid) references dichvu (dichvuid);
alter table dichvu
    add constraint fk_dichvu_loaixe foreign key (loaixeid) references loaixe (loaixeid);
alter table danhgia
    add constraint fk_danhgia_khachhang foreign key (khachhangid) references khachhang (khachhangid);
alter table danhgia
    add constraint fk_danhgia_doitac foreign key (doitacid) references doitac (doitacid);
alter table chitietdichvu
    add constraint fk_chitietdichvu_thanhtoan foreign key (thanhtoanid) references thanhtoan (thanhtoanid);
alter table chitietdichvu
    add constraint fk_chitietdichvu_doitac foreign key (doitacid) references doitac (doitacid);
alter table chitietdichvu
    add constraint fk_chitietdichvu_dichvu foreign key (dichvuid) references dichvu (dichvuid);
alter table thanhtoan
    add constraint fk_thanhtoan_khachhang foreign key (khachhangid) references khachhang (khachhangid);
alter table hotrotructuyen
    add constraint fk_hotrotructuyen_khachhang foreign key (khachhangid) references khachhang (khachhangid);
