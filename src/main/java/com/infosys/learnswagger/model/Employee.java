package com.infosys.learnswagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "employees")
@ApiModel(description="All details about the Employee. ")
public class Employee {

    @ApiModelProperty(notes = "The database generated employee ID")
    @Id
    private long id;

    @ApiModelProperty(notes = "The employee first name")
    private String firstName;

    @ApiModelProperty(notes = "The employee last name")
    private String lastName;

    @ApiModelProperty(notes = "The employee email id")
    private String emailId;
}

/**
 * @ApiModel = Memberikan informasi tambahan tentang model Swagger.
 * @ApiModelProperty = Menambahkan dan memanipulasi data properti model.
 */
