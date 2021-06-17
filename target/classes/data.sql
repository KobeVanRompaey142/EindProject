
insert into SIMP (
    ID, GROUP_NAME, LEEFTIJD, LINK_MORE_INFO, ADRESSE, PUNTEN)
values (
           1, 'sloebers',6, 'https://jongenschirokodb.be/',
           'Mechelseweg 100A, 1880 Kapelle-op-den-Bos',5);


insert into SIMP (
    ID, GROUP_NAME, LEEFTIJD, LINK_MORE_INFO, ADRESSE, PUNTEN)
values (
           2, 'speelclub',8, 'https://jongenschirokodb.be/',
           'Mechelseweg 100A, 1880 Kapelle-op-den-Bos',4);


insert into SIMP (
    ID, GROUP_NAME, LEEFTIJD, LINK_MORE_INFO, ADRESSE, PUNTEN)
values (
           3, 'rakkers',10, 'https://jongenschirokodb.be/',
           'Mechelseweg 100A, 1880 Kapelle-op-den-Bos',8);


insert into SIMP (
    ID, GROUP_NAME, LEEFTIJD, LINK_MORE_INFO, ADRESSE, PUNTEN)
values (
           4, 'toppers',12, 'https://jongenschirokodb.be/',
           'Mechelseweg 100A, 1880 Kapelle-op-den-Bos',5);

insert into SIMP (
    ID, GROUP_NAME, LEEFTIJD, LINK_MORE_INFO, ADRESSE, PUNTEN)
values (
           5, 'kerels',15, 'https://jongenschirokodb.be/',
           'Mechelseweg 100A, 1880 Kapelle-op-den-Bos',3);


insert into SIMP (
    ID, GROUP_NAME, LEEFTIJD, LINK_MORE_INFO, ADRESSE, PUNTEN)
values (
           6, 'aspiranten',17, 'https://jongenschirokodb.be/',
           'Mechelseweg 100A, 1880 Kapelle-op-den-Bos',8);



insert into BIER (
ID, BIER_NAAM, ALCHOL_NIVEAU, AANTAL_STICKERS,  GLUTEN,BROUWJAAR,BROUWER,FRUIT
)

values (
nextval('bier_seq'), 'Jupiler', 5, 1, true,1965,'Jupiler',false );
insert into BIER (
    ID, BIER_NAAM, ALCHOL_NIVEAU, AANTAL_STICKERS,  GLUTEN,BROUWJAAR,BROUWER,FRUIT
)
values (
nextval('bier_seq'), 'Carolus tripel', 9, 3,  false, 1988,'hosana',false );
insert into BIER (
    ID, BIER_NAAM, ALCHOL_NIVEAU, AANTAL_STICKERS,  GLUTEN,BROUWJAAR,BROUWER,FRUIT
)
values (
nextval('bier_seq'), 'Kriek', 3, 1,  false,1966,'heerschap',true );
insert into BIER (
    ID, BIER_NAAM, ALCHOL_NIVEAU, AANTAL_STICKERS,  GLUTEN,BROUWJAAR,BROUWER,FRUIT
)
values (
nextval('bier_seq'), 'Carolus classic', 8, 3, false,1888,'holapola',false );
insert into BIER (
    ID, BIER_NAAM, ALCHOL_NIVEAU, AANTAL_STICKERS,  GLUTEN,BROUWJAAR,BROUWER,FRUIT)
values (
nextval('bier_seq'), 'Kasteel rouge', 8, 3,  true,1655,'chateaumal',true );
insert into BIER (
    ID, BIER_NAAM, ALCHOL_NIVEAU, AANTAL_STICKERS,  GLUTEN,BROUWJAAR,BROUWER,FRUIT)
values (
nextval('bier_seq'), 'Stella', 5, 1,  true,1999,'stella',false );
insert into BIER (
    ID, BIER_NAAM, ALCHOL_NIVEAU, AANTAL_STICKERS,  GLUTEN,BROUWJAAR,BROUWER,FRUIT)
values (
nextval('bier_seq'), 'Oude geuzeboon', 9, 0,  false,1666,'Neuzeke',true );
insert into BIER (
    ID, BIER_NAAM, ALCHOL_NIVEAU, AANTAL_STICKERS,  GLUTEN,BROUWJAAR,BROUWER,FRUIT)
values (
nextval('bier_seq'), 'Martini rouge', 7, 0, false,1555,'hallopater',true );
insert into BIER (
    ID, BIER_NAAM, ALCHOL_NIVEAU, AANTAL_STICKERS,  GLUTEN,BROUWJAAR,BROUWER,FRUIT)
values (
nextval('bier_seq'), 'Duvel', 9, 3, false,1897,'Duvel',true);


INSERT INTO BIER_SIMPS(BIERS_ID, SIMPS_ID) values (1,1);
INSERT INTO BIER_SIMPS(BIERS_ID, SIMPS_ID) values (3,6);
INSERT INTO BIER_SIMPS(BIERS_ID, SIMPS_ID) values (9,5);
INSERT INTO BIER_SIMPS(BIERS_ID, SIMPS_ID) values (4,2);
INSERT INTO BIER_SIMPS(BIERS_ID, SIMPS_ID) values (2,3);
INSERT INTO BIER_SIMPS(BIERS_ID, SIMPS_ID) values (7,4);
INSERT INTO BIER_SIMPS(BIERS_ID, SIMPS_ID) values (4,2);
INSERT INTO BIER_SIMPS(BIERS_ID, SIMPS_ID) values (5,1);
