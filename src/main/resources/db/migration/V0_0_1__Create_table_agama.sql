/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  iqbal
 * Created: 05-Feb-2018
 */

CREATE TABLE master_agama (
  kode_agama   CHARACTER VARYING(255) NOT NULL PRIMARY KEY,
  nama_agama   CHARACTER VARYING(50)  NOT NULL UNIQUE,
  deskripsi   CHARACTER VARYING(255),
  created_date TIMESTAMP,
  created_by   CHARACTER VARYING(50)
);