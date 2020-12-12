create table if not exists person
(
	person_id varchar(10) not null
		constraint person_pk
			primary key,
	gender_concept_id varchar(5),
	year_of_birth integer,
	month_of_birth integer,
	day_of_birth integer,
	birth_datetime varchar(20),
	race_concept_id varchar(5),
	ethnicity_concept_id varchar(5),
	location_id varchar(1),
	provider_id varchar(1),
	care_site_id varchar(1),
	person_source_value varchar(40),
	gender_source_value varchar(1),
	gender_source_concept_id varchar(10),
	race_source_value varchar(10),
	race_source_concept_id varchar(10),
	ethnicity_source_value varchar(15),
	ethnicity_source_concept_id varchar(10)
);

alter table person owner to postgres;

create table if not exists visit_occurrence
(
	visit_occurrence_id varchar(10) not null
		constraint visit_occurrence_pk
			primary key,
	person_id varchar(10)
		constraint visit_occurrence_person_person_id_fk
			references person,
	visit_concept_id varchar(10),
	visit_start_date varchar(10),
	visit_start_datetime varchar(20),
	visit_end_date varchar(10),
	visit_end_datetime varchar(20),
	visit_type_concept_id varchar(10),
	provider_id varchar(1),
	care_site_id varchar(1),
	visit_source_value varchar(40),
	visit_source_concept_id varchar(10),
	admitting_source_concept_id varchar(10),
	admitting_source_value varchar(1),
	discharge_to_concept_id varchar(10),
	discharge_to_source_value varchar(1),
	preceding_visit_occurrence_id varchar(10)
);

alter table visit_occurrence owner to postgres;

create table if not exists condition_occurrence
(
	condition_occurrence_id varchar(10) not null
		constraint condition_occurrence_pk
			primary key,
	person_id varchar(10)
		constraint condition_occurrence_person_person_id_fk
			references person,
	condition_concept_id varchar(10),
	condition_start_date varchar(10),
	condition_start_datetime varchar(20),
	condition_end_date varchar(10),
	condition_end_datetime varchar(20),
	condition_type_concept_id varchar(10),
	stop_reason varchar(1),
	provider_id varchar(1),
	visit_occurrence_id varchar(10)
		constraint condition_occurrence_visit_occurrence_visit_occurrence_id_fk
			references visit_occurrence,
	visit_detail_id varchar(10),
	condition_source_value varchar(10),
	condition_source_concept_id varchar(10),
	condition_status_source_value varchar(1),
	condition_status_concept_id varchar(10)
);

alter table condition_occurrence owner to postgres;

create table if not exists drug_exposure
(
	drug_exposure_id varchar(10) not null
		constraint drug_exposure_pk
			primary key,
	person_id varchar(10)
		constraint drug_exposure_person_person_id_fk
			references person,
	drug_concept_id varchar(10),
	drug_exposure_start_date varchar(10),
	drug_exposure_start_datetime varchar(20),
	drug_exposure_end_date varchar(10),
	drug_exposure_end_datetime varchar(20),
	verbatim_end_date varchar(10),
	drug_type_concept_id varchar(10),
	stop_reason varchar(1),
	refills varchar(5),
	quantity varchar(10),
	days_supply varchar(10),
	sig varchar(1),
	route_concept_id varchar(10),
	lot_number integer,
	provider_id varchar(10),
	visit_occurrence_id varchar(10)
		constraint drug_exposure_visit_occurrence_visit_occurrence_id_fk
			references visit_occurrence,
	visit_detail_id varchar(10),
	drug_source_value varchar(10),
	drug_source_concept_id varchar(10),
	route_source_value varchar(1),
	dose_unit_source_value varchar(1)
);

alter table drug_exposure owner to postgres;

create table if not exists death
(
	person_id varchar(10) not null
		constraint death_person_person_id_fk
			references person,
	death_date varchar(10),
	death_datetime varchar(1),
	death_type_concept_id varchar(5),
	cause_concept_id varchar(10),
	cause_source_value varchar(10),
	cause_source_concept_id varchar(1)
);

alter table death owner to postgres;

create table if not exists concept
(
	concept_id varchar(10) not null
		constraint concept_pk
			primary key,
	concept_name varchar(100),
	domain_id varchar(10),
	vocabulary_id varchar(10),
	concept_class_id varchar(10),
	standard_concept varchar(1),
	concept_code varchar(20),
	valid_start_date varchar(10),
	valid_end_date varchar(10),
	invalid_reason varchar(1)
);

alter table concept owner to postgres;

create index if not exists idx_text
	on concept (concept_name);

