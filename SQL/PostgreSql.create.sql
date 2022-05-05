




CREATE TABLE Comment (
 primaryKey UUID NOT NULL,
 CreateTime TIMESTAMP(3) NULL,
 Creator VARCHAR(255) NULL,
 EditTime TIMESTAMP(3) NULL,
 Editor VARCHAR(255) NULL,
 Text VARCHAR(255) NULL,
 Votes BIGINT NULL,
 Moderated BOOLEAN NULL,
 Author UUID NOT NULL,
 Suggestion UUID NOT NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE SuggestionFile (
 primaryKey UUID NOT NULL,
 CreateTime TIMESTAMP(3) NULL,
 Creator VARCHAR(255) NULL,
 EditTime TIMESTAMP(3) NULL,
 Editor VARCHAR(255) NULL,
 "Order" INT NULL,
 File TEXT NULL,
 Suggestion UUID NOT NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE listLocalization (
 primaryKey UUID NOT NULL,
 name VARCHAR(255) NULL,
 localeValue VARCHAR(255) NULL,
 Catalog UUID NOT NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE TogglerExampleMaster (
 primaryKey UUID NOT NULL,
 TogglerExampleMasterProperty VARCHAR(255) NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE SuggestionType (
 primaryKey UUID NOT NULL,
 CreateTime TIMESTAMP(3) NULL,
 Creator VARCHAR(255) NULL,
 EditTime TIMESTAMP(3) NULL,
 Editor VARCHAR(255) NULL,
 Name VARCHAR(255) NOT NULL,
 Moderated BOOLEAN NULL,
 Parent UUID NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE StudentRecord (
 primaryKey UUID NOT NULL,
 SrFIO VARCHAR(255) NULL,
 SrCours INT NULL,
 UniquelD VARCHAR(255) NULL,
 ObjectPK INT NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE Catalog (
 primaryKey UUID NOT NULL,
 name VARCHAR(255) NULL,
 CatalogMaster UUID NOT NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE TogglerExampleDetail (
 primaryKey UUID NOT NULL,
 TogglerExampleDetailProperty VARCHAR(255) NULL,
 TogglerExampleMaster UUID NOT NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE LazyLoadingDetail (
 primaryKey UUID NOT NULL,
 DetailText VARCHAR(255) NULL,
 LazyLoadingMaster UUID NOT NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE Master (
 primaryKey UUID NOT NULL,
 Name VARCHAR(255) NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE CommentVote (
 primaryKey UUID NOT NULL,
 CreateTime TIMESTAMP(3) NULL,
 Creator VARCHAR(255) NULL,
 EditTime TIMESTAMP(3) NULL,
 Editor VARCHAR(255) NULL,
 VoteType VARCHAR(7) NULL,
 ApplicationUser UUID NOT NULL,
 Comment UUID NOT NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE TestPoly (
 primaryKey UUID NOT NULL,
 SelfPole VARCHAR(255) NULL,
 Relation_m0 UUID NULL,
 Relation_m1 UUID NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE Parent (
 primaryKey UUID NOT NULL,
 Name VARCHAR(255) NULL,
 EMail VARCHAR(255) NULL,
 Birthday TIMESTAMP(3) NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE LazyLoadingMaster (
 primaryKey UUID NOT NULL,
 MasterText VARCHAR(255) NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE Localization (
 primaryKey UUID NOT NULL,
 CreateTime TIMESTAMP(3) NULL,
 Creator VARCHAR(255) NULL,
 EditTime TIMESTAMP(3) NULL,
 Editor VARCHAR(255) NULL,
 Name VARCHAR(255) NOT NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE GraduateRecord (
 primaryKey UUID NOT NULL,
 GrFIO VARCHAR(255) NULL,
 GrYearGrad INT NULL,
 UniquelD VARCHAR(255) NULL,
 ObjectPK INT NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE Detail (
 primaryKey UUID NOT NULL,
 Name VARCHAR(255) NULL,
 ParentDetail UUID NULL,
 Master UUID NOT NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE TestPolyChild (
 primaryKey UUID NOT NULL,
 ChildPole INT NULL,
 Pole VARCHAR(255) NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE ChildLevel1 (
 primaryKey UUID NOT NULL,
 TextChild1 VARCHAR(255) NULL,
 CreateTime TIMESTAMP(3) NULL,
 Creator VARCHAR(255) NULL,
 EditTime TIMESTAMP(3) NULL,
 Editor VARCHAR(255) NULL,
 Address VARCHAR(255) NULL,
 Text VARCHAR(255) NULL,
 Date TIMESTAMP(3) NULL,
 Votes BIGINT NULL,
 Moderated BOOLEAN NULL,
 Type UUID NOT NULL,
 Author UUID NOT NULL,
 Editor1 UUID NOT NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE LookupDropdown (
 primaryKey UUID NOT NULL,
 Name VARCHAR(255) NULL,
 MasterLookupDropdown UUID NOT NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE TestPolyAnotherChild (
 primaryKey UUID NOT NULL,
 ChildAnotherPole BOOLEAN NULL,
 Pole VARCHAR(255) NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE SuccessorSocialNetwork (
 primaryKey UUID NOT NULL,
 VK VARCHAR(255) NULL,
 Facebook VARCHAR(255) NULL,
 Twitter VARCHAR(255) NULL,
 Name VARCHAR(255) NULL,
 EMail VARCHAR(255) NULL,
 Birthday TIMESTAMP(3) NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE Vote (
 primaryKey UUID NOT NULL,
 CreateTime TIMESTAMP(3) NULL,
 Creator VARCHAR(255) NULL,
 EditTime TIMESTAMP(3) NULL,
 Editor VARCHAR(255) NULL,
 VoteType VARCHAR(7) NULL,
 ApplicationUser UUID NOT NULL,
 Suggestion UUID NOT NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE CatalogMaster (
 primaryKey UUID NOT NULL,
 name VARCHAR(255) NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE Suggestion (
 primaryKey UUID NOT NULL,
 CreateTime TIMESTAMP(3) NULL,
 Creator VARCHAR(255) NULL,
 EditTime TIMESTAMP(3) NULL,
 Editor VARCHAR(255) NULL,
 Address VARCHAR(255) NULL,
 Text VARCHAR(255) NULL,
 Date TIMESTAMP(3) NULL,
 Votes BIGINT NULL,
 Moderated BOOLEAN NULL,
 Type UUID NOT NULL,
 Author UUID NOT NULL,
 Editor1 UUID NOT NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE ChildLevel2 (
 primaryKey UUID NOT NULL,
 TextChild2 VARCHAR(255) NULL,
 obj TEXT NULL,
 TextChild1 VARCHAR(255) NULL,
 CreateTime TIMESTAMP(3) NULL,
 Creator VARCHAR(255) NULL,
 EditTime TIMESTAMP(3) NULL,
 Editor VARCHAR(255) NULL,
 Address VARCHAR(255) NULL,
 Text VARCHAR(255) NULL,
 Date TIMESTAMP(3) NULL,
 Votes BIGINT NULL,
 Moderated BOOLEAN NULL,
 Type UUID NOT NULL,
 Author UUID NOT NULL,
 Editor1 UUID NOT NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE MasterLookupDropdown (
 primaryKey UUID NOT NULL,
 Text VARCHAR(255) NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE ApplicationUser (
 primaryKey UUID NOT NULL,
 CreateTime TIMESTAMP(3) NULL,
 Creator VARCHAR(255) NULL,
 EditTime TIMESTAMP(3) NULL,
 Editor VARCHAR(255) NULL,
 Name VARCHAR(255) NOT NULL,
 EMail VARCHAR(255) NOT NULL,
 Phone1 VARCHAR(255) NULL,
 Phone2 VARCHAR(255) NULL,
 Phone3 VARCHAR(255) NULL,
 Activated BOOLEAN NULL,
 VK VARCHAR(255) NULL,
 Facebook VARCHAR(255) NULL,
 Twitter VARCHAR(255) NULL,
 Birthday TIMESTAMP(3) NULL,
 Gender VARCHAR(6) NULL,
 Vip BOOLEAN NULL,
 Karma DECIMAL NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE SuccessorPhone (
 primaryKey UUID NOT NULL,
 Phone1 VARCHAR(255) NULL,
 Phone2 VARCHAR(255) NULL,
 Phone3 VARCHAR(255) NULL,
 Name VARCHAR(255) NULL,
 EMail VARCHAR(255) NULL,
 Birthday TIMESTAMP(3) NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE LocalizedSuggestionType (
 primaryKey UUID NOT NULL,
 CreateTime TIMESTAMP(3) NULL,
 Creator VARCHAR(255) NULL,
 EditTime TIMESTAMP(3) NULL,
 Editor VARCHAR(255) NULL,
 Name VARCHAR(255) NOT NULL,
 Localization UUID NOT NULL,
 SuggestionType UUID NOT NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE STORMNETLOCKDATA (
 LockKey VARCHAR(300) NOT NULL,
 UserName VARCHAR(300) NOT NULL,
 LockDate TIMESTAMP(3) NULL,
 PRIMARY KEY (LockKey));


CREATE TABLE STORMSETTINGS (
 primaryKey UUID NOT NULL,
 Module VARCHAR(1000) NULL,
 Name VARCHAR(255) NULL,
 Value TEXT NULL,
 "User" VARCHAR(255) NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE STORMAdvLimit (
 primaryKey UUID NOT NULL,
 "User" VARCHAR(255) NULL,
 Published BOOLEAN NULL,
 Module VARCHAR(255) NULL,
 Name VARCHAR(255) NULL,
 Value TEXT NULL,
 HotKeyData INT NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE STORMFILTERSETTING (
 primaryKey UUID NOT NULL,
 Name VARCHAR(255) NOT NULL,
 DataObjectView VARCHAR(255) NOT NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE STORMWEBSEARCH (
 primaryKey UUID NOT NULL,
 Name VARCHAR(255) NOT NULL,
 "Order" INT NOT NULL,
 PresentView VARCHAR(255) NOT NULL,
 DetailedView VARCHAR(255) NOT NULL,
 FilterSetting_m0 UUID NOT NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE STORMFILTERDETAIL (
 primaryKey UUID NOT NULL,
 Caption VARCHAR(255) NOT NULL,
 DataObjectView VARCHAR(255) NOT NULL,
 ConnectMasterProp VARCHAR(255) NOT NULL,
 OwnerConnectProp VARCHAR(255) NULL,
 FilterSetting_m0 UUID NOT NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE STORMFILTERLOOKUP (
 primaryKey UUID NOT NULL,
 DataObjectType VARCHAR(255) NOT NULL,
 Container VARCHAR(255) NULL,
 ContainerTag VARCHAR(255) NULL,
 FieldsToView VARCHAR(255) NULL,
 FilterSetting_m0 UUID NOT NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE UserSetting (
 primaryKey UUID NOT NULL,
 AppName VARCHAR(256) NULL,
 UserName VARCHAR(512) NULL,
 UserGuid UUID NULL,
 ModuleName VARCHAR(1024) NULL,
 ModuleGuid UUID NULL,
 SettName VARCHAR(256) NULL,
 SettGuid UUID NULL,
 SettLastAccessTime TIMESTAMP(3) NULL,
 StrVal VARCHAR(256) NULL,
 TxtVal TEXT NULL,
 IntVal INT NULL,
 BoolVal BOOLEAN NULL,
 GuidVal UUID NULL,
 DecimalVal DECIMAL(20,10) NULL,
 DateTimeVal TIMESTAMP(3) NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE ApplicationLog (
 primaryKey UUID NOT NULL,
 Category VARCHAR(64) NULL,
 EventId INT NULL,
 Priority INT NULL,
 Severity VARCHAR(32) NULL,
 Title VARCHAR(256) NULL,
 Timestamp TIMESTAMP(3) NULL,
 MachineName VARCHAR(32) NULL,
 AppDomainName VARCHAR(512) NULL,
 ProcessId VARCHAR(256) NULL,
 ProcessName VARCHAR(512) NULL,
 ThreadName VARCHAR(512) NULL,
 Win32ThreadId VARCHAR(128) NULL,
 Message VARCHAR(2500) NULL,
 FormattedMessage TEXT NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE STORMAuObjType (
 primaryKey UUID NOT NULL,
 Name VARCHAR(255) NOT NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE STORMAuEntity (
 primaryKey UUID NOT NULL,
 ObjectPrimaryKey VARCHAR(38) NOT NULL,
 OperationTime TIMESTAMP(3) NOT NULL,
 OperationType VARCHAR(100) NOT NULL,
 ExecutionResult VARCHAR(12) NOT NULL,
 Source VARCHAR(255) NOT NULL,
 SerializedField TEXT NULL,
 User_m0 UUID NOT NULL,
 ObjectType_m0 UUID NOT NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE STORMAuField (
 primaryKey UUID NOT NULL,
 Field VARCHAR(100) NOT NULL,
 OldValue TEXT NULL,
 NewValue TEXT NULL,
 MainChange_m0 UUID NULL,
 AuditEntity_m0 UUID NOT NULL,
 PRIMARY KEY (primaryKey));



 ALTER TABLE Comment ADD CONSTRAINT FKaac2a9dc6559a0876a24219d4547c3cdfb0cf66c FOREIGN KEY (Author) REFERENCES ApplicationUser; 
CREATE INDEX Indexaac2a9dc6559a0876a24219d4547c3cdfb0cf66c on Comment (Author); 

 ALTER TABLE Comment ADD CONSTRAINT FKfd92fd87af0ccd97836e276584c8b253a22c941a FOREIGN KEY (Suggestion) REFERENCES Suggestion; 
CREATE INDEX Indexfd92fd87af0ccd97836e276584c8b253a22c941a on Comment (Suggestion); 

 ALTER TABLE SuggestionFile ADD CONSTRAINT FKf4290c75a74c571c192bdd4301038dac5fc3f7c1 FOREIGN KEY (Suggestion) REFERENCES Suggestion; 
CREATE INDEX Indexf4290c75a74c571c192bdd4301038dac5fc3f7c1 on SuggestionFile (Suggestion); 

 ALTER TABLE listLocalization ADD CONSTRAINT FKbf5f75077ddcf74d3365a87f9087f1ca9ae0cfc7 FOREIGN KEY (Catalog) REFERENCES Catalog; 
CREATE INDEX Indexbf5f75077ddcf74d3365a87f9087f1ca9ae0cfc7 on listLocalization (Catalog); 

 ALTER TABLE SuggestionType ADD CONSTRAINT FK94b3447d51500fccd00881cabdc2fb990a3cba76 FOREIGN KEY (Parent) REFERENCES SuggestionType; 
CREATE INDEX Index94b3447d51500fccd00881cabdc2fb990a3cba76 on SuggestionType (Parent); 

 ALTER TABLE Catalog ADD CONSTRAINT FK9dfaaf24ae5f1483810d2c299110c3785ccd232e FOREIGN KEY (CatalogMaster) REFERENCES CatalogMaster; 
CREATE INDEX Index9dfaaf24ae5f1483810d2c299110c3785ccd232e on Catalog (CatalogMaster); 

 ALTER TABLE TogglerExampleDetail ADD CONSTRAINT FKef57a20b1987b9d39912c117fc6f16e7847a58b6 FOREIGN KEY (TogglerExampleMaster) REFERENCES TogglerExampleMaster; 
CREATE INDEX Indexef57a20b1987b9d39912c117fc6f16e7847a58b6 on TogglerExampleDetail (TogglerExampleMaster); 

 ALTER TABLE LazyLoadingDetail ADD CONSTRAINT FKdb1c8fc9d4fa641cc426805f1d2aea5f7179fd98 FOREIGN KEY (LazyLoadingMaster) REFERENCES LazyLoadingMaster; 
CREATE INDEX Indexdb1c8fc9d4fa641cc426805f1d2aea5f7179fd98 on LazyLoadingDetail (LazyLoadingMaster); 

 ALTER TABLE CommentVote ADD CONSTRAINT FK189b97a4bbff4e4f9254008f2d1a08cd436c6190 FOREIGN KEY (ApplicationUser) REFERENCES ApplicationUser; 
CREATE INDEX Index189b97a4bbff4e4f9254008f2d1a08cd436c6190 on CommentVote (ApplicationUser); 

 ALTER TABLE CommentVote ADD CONSTRAINT FKae878d16410f255f04768a29cb264f52dd6cd30c FOREIGN KEY (Comment) REFERENCES Comment; 
CREATE INDEX Indexae878d16410f255f04768a29cb264f52dd6cd30c on CommentVote (Comment); 

 ALTER TABLE TestPoly ADD CONSTRAINT FKcb8c0f3589bbcd885c248d7febe682d25d61ea01 FOREIGN KEY (Relation_m0) REFERENCES TestPolyChild; 
CREATE INDEX Indexcb8c0f3589bbcd885c248d7febe682d25d61ea01 on TestPoly (Relation_m0); 

 ALTER TABLE TestPoly ADD CONSTRAINT FK738ac21ecbbfffabd53cde3303acbf8b44bafcbb FOREIGN KEY (Relation_m1) REFERENCES TestPolyAnotherChild; 
CREATE INDEX Index738ac21ecbbfffabd53cde3303acbf8b44bafcbb on TestPoly (Relation_m1); 

 ALTER TABLE Detail ADD CONSTRAINT FK3736f4fbed55c9f03665cf5d74b0afc7bdc34406 FOREIGN KEY (ParentDetail) REFERENCES Detail; 
CREATE INDEX Index3736f4fbed55c9f03665cf5d74b0afc7bdc34406 on Detail (ParentDetail); 

 ALTER TABLE Detail ADD CONSTRAINT FK524e7b747b216f14f0352e3d4347076c24903083 FOREIGN KEY (Master) REFERENCES Master; 
CREATE INDEX Index524e7b747b216f14f0352e3d4347076c24903083 on Detail (Master); 

 ALTER TABLE ChildLevel1 ADD CONSTRAINT FKcc68fda6b5ddcf392c6746e793e4c15194e2fea9 FOREIGN KEY (Type) REFERENCES SuggestionType; 
CREATE INDEX Indexcc68fda6b5ddcf392c6746e793e4c15194e2fea9 on ChildLevel1 (Type); 

 ALTER TABLE ChildLevel1 ADD CONSTRAINT FKbbf16911b44cb5a53a54278c1d3853e581a6831a FOREIGN KEY (Author) REFERENCES ApplicationUser; 
CREATE INDEX Indexbbf16911b44cb5a53a54278c1d3853e581a6831a on ChildLevel1 (Author); 

 ALTER TABLE ChildLevel1 ADD CONSTRAINT FKa28613c2ae0451ce3edf611a95bec8942a1e9e60 FOREIGN KEY (Editor1) REFERENCES ApplicationUser; 
CREATE INDEX Indexa28613c2ae0451ce3edf611a95bec8942a1e9e60 on ChildLevel1 (Editor1); 

 ALTER TABLE LookupDropdown ADD CONSTRAINT FK6c2daa278ed6657a7312e438c2da0ee25cfb46c4 FOREIGN KEY (MasterLookupDropdown) REFERENCES MasterLookupDropdown; 
CREATE INDEX Index6c2daa278ed6657a7312e438c2da0ee25cfb46c4 on LookupDropdown (MasterLookupDropdown); 

 ALTER TABLE Vote ADD CONSTRAINT FK176f5dd5b52ee61483ab1e4147f28a756aa6cdee FOREIGN KEY (ApplicationUser) REFERENCES ApplicationUser; 
CREATE INDEX Index176f5dd5b52ee61483ab1e4147f28a756aa6cdee on Vote (ApplicationUser); 

 ALTER TABLE Vote ADD CONSTRAINT FKbf6df88f1742716ed613c1164966b8a15d051912 FOREIGN KEY (Suggestion) REFERENCES Suggestion; 
CREATE INDEX Indexbf6df88f1742716ed613c1164966b8a15d051912 on Vote (Suggestion); 

 ALTER TABLE Suggestion ADD CONSTRAINT FK9ee0d11fc1090b8b620983e4e660b8421facca37 FOREIGN KEY (Type) REFERENCES SuggestionType; 
CREATE INDEX Index9ee0d11fc1090b8b620983e4e660b8421facca37 on Suggestion (Type); 

 ALTER TABLE Suggestion ADD CONSTRAINT FK98b129d089a10269376a3cecc723d1d51eee0ed8 FOREIGN KEY (Author) REFERENCES ApplicationUser; 
CREATE INDEX Index98b129d089a10269376a3cecc723d1d51eee0ed8 on Suggestion (Author); 

 ALTER TABLE Suggestion ADD CONSTRAINT FKf721d341d5b25fd75d071b64794b8a609a92e1b3 FOREIGN KEY (Editor1) REFERENCES ApplicationUser; 
CREATE INDEX Indexf721d341d5b25fd75d071b64794b8a609a92e1b3 on Suggestion (Editor1); 

 ALTER TABLE ChildLevel2 ADD CONSTRAINT FKba2a22328adfbfed0e396b56733b9f26690c444e FOREIGN KEY (Type) REFERENCES SuggestionType; 
CREATE INDEX Indexba2a22328adfbfed0e396b56733b9f26690c444e on ChildLevel2 (Type); 

 ALTER TABLE ChildLevel2 ADD CONSTRAINT FK37981cf5cfc1f6945f325a7bb283a025c13cde4e FOREIGN KEY (Author) REFERENCES ApplicationUser; 
CREATE INDEX Index37981cf5cfc1f6945f325a7bb283a025c13cde4e on ChildLevel2 (Author); 

 ALTER TABLE ChildLevel2 ADD CONSTRAINT FK20d9731e59bf1ef9626ec34f8fc9efd5746813b5 FOREIGN KEY (Editor1) REFERENCES ApplicationUser; 
CREATE INDEX Index20d9731e59bf1ef9626ec34f8fc9efd5746813b5 on ChildLevel2 (Editor1); 

 ALTER TABLE LocalizedSuggestionType ADD CONSTRAINT FK8ad8bdbbf758323a30d04a86829b93c404e4ec4a FOREIGN KEY (Localization) REFERENCES Localization; 
CREATE INDEX Index8ad8bdbbf758323a30d04a86829b93c404e4ec4a on LocalizedSuggestionType (Localization); 

 ALTER TABLE LocalizedSuggestionType ADD CONSTRAINT FKb152c26239995bf42b87e24fd99b5fe571e6b395 FOREIGN KEY (SuggestionType) REFERENCES SuggestionType; 
CREATE INDEX Indexb152c26239995bf42b87e24fd99b5fe571e6b395 on LocalizedSuggestionType (SuggestionType); 

 ALTER TABLE STORMWEBSEARCH ADD CONSTRAINT FKc4378e39870eb056aec84088683297a01d2a6200 FOREIGN KEY (FilterSetting_m0) REFERENCES STORMFILTERSETTING; 

 ALTER TABLE STORMFILTERDETAIL ADD CONSTRAINT FK921d16269835017e2a0d0e29ad6fb175454a70d0 FOREIGN KEY (FilterSetting_m0) REFERENCES STORMFILTERSETTING; 

 ALTER TABLE STORMFILTERLOOKUP ADD CONSTRAINT FKce38ef0db3f01a53acaa49fed8853fb941ad47ba FOREIGN KEY (FilterSetting_m0) REFERENCES STORMFILTERSETTING; 
CREATE INDEX Indexaa1a3fec50499d204c389473163d0d8f55d4aed9 on STORMAuEntity (ObjectPrimaryKey); 
CREATE INDEX Indexa06334f170abdcbe9ebbf9a1c97a105e31caac8d on STORMAuEntity (upper(ObjectPrimaryKey)); 
CREATE INDEX Index969964c4b120bd7eebed319d77e182a5adf20816 on STORMAuEntity (OperationTime); 
CREATE INDEX Index44feded66c1cee358e0db313bcaa06e5f8d8e549 on STORMAuEntity (User_m0); 

 ALTER TABLE STORMAuEntity ADD CONSTRAINT FKb5725f55e665c6b660aff02c558b5ba413523eaa FOREIGN KEY (ObjectType_m0) REFERENCES STORMAuObjType; 
CREATE INDEX Indexb5725f55e665c6b660aff02c558b5ba413523eaa on STORMAuEntity (ObjectType_m0); 

 ALTER TABLE STORMAuField ADD CONSTRAINT FKf2cc121c707b1bf4290f2bb625d1d112b4919288 FOREIGN KEY (MainChange_m0) REFERENCES STORMAuField; 

 ALTER TABLE STORMAuField ADD CONSTRAINT FK680dbb7e20a2404a7439d4de2d06d669f165bafe FOREIGN KEY (AuditEntity_m0) REFERENCES STORMAuEntity; 
CREATE INDEX Index680dbb7e20a2404a7439d4de2d06d669f165bafe on STORMAuField (AuditEntity_m0); 

