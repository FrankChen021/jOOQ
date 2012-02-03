/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.humanresources;

/**
 * This class is generated by jOOQ.
 *
 * A class modelling foreign key relationships between tables of the HumanResources schema
 */
@SuppressWarnings({"unchecked"})
public class Keys extends org.jooq.impl.AbstractKeys {

	// IDENTITY definitions
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.DepartmentRecord, java.lang.Short> IDENTITY_Department = createIdentity(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Department.DEPARTMENT, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Department.DEPARTMENT.DEPARTMENTID);
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeeRecord, java.lang.Integer> IDENTITY_Employee = createIdentity(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.EMPLOYEE, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.EMPLOYEE.EMPLOYEEID);
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.JobcandidateRecord, java.lang.Integer> IDENTITY_JobCandidate = createIdentity(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Jobcandidate.JOBCANDIDATE, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Jobcandidate.JOBCANDIDATE.JOBCANDIDATEID);
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.ShiftRecord, java.lang.Byte> IDENTITY_Shift = createIdentity(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Shift.SHIFT, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Shift.SHIFT.SHIFTID);
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.VjobcandidateRecord, java.lang.Integer> IDENTITY_vJobCandidate = createIdentity(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Vjobcandidate.VJOBCANDIDATE, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Vjobcandidate.VJOBCANDIDATE.JOBCANDIDATEID);
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.VjobcandidateeducationRecord, java.lang.Integer> IDENTITY_vJobCandidateEducation = createIdentity(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Vjobcandidateeducation.VJOBCANDIDATEEDUCATION, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Vjobcandidateeducation.VJOBCANDIDATEEDUCATION.JOBCANDIDATEID);
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.VjobcandidateemploymentRecord, java.lang.Integer> IDENTITY_vJobCandidateEmployment = createIdentity(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Vjobcandidateemployment.VJOBCANDIDATEEMPLOYMENT, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Vjobcandidateemployment.VJOBCANDIDATEEMPLOYMENT.JOBCANDIDATEID);

	// UNIQUE and PRIMARY KEY definitions
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.DepartmentRecord> PK_Department_DepartmentID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Department.DEPARTMENT, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Department.DEPARTMENT.DEPARTMENTID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeeRecord> PK_Employee_EmployeeID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.EMPLOYEE, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.EMPLOYEE.EMPLOYEEID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeeaddressRecord> PK_EmployeeAddress_EmployeeID_AddressID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employeeaddress.EMPLOYEEADDRESS, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employeeaddress.EMPLOYEEADDRESS.EMPLOYEEID, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employeeaddress.EMPLOYEEADDRESS.ADDRESSID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeedepartmenthistoryRecord> PK_EmployeeDepartmentHistory_EmployeeID_StartDate_DepartmentID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employeedepartmenthistory.EMPLOYEEDEPARTMENTHISTORY, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employeedepartmenthistory.EMPLOYEEDEPARTMENTHISTORY.EMPLOYEEID, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employeedepartmenthistory.EMPLOYEEDEPARTMENTHISTORY.STARTDATE, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employeedepartmenthistory.EMPLOYEEDEPARTMENTHISTORY.DEPARTMENTID, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employeedepartmenthistory.EMPLOYEEDEPARTMENTHISTORY.SHIFTID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeepayhistoryRecord> PK_EmployeePayHistory_EmployeeID_RateChangeDate = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employeepayhistory.EMPLOYEEPAYHISTORY, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employeepayhistory.EMPLOYEEPAYHISTORY.EMPLOYEEID, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employeepayhistory.EMPLOYEEPAYHISTORY.RATECHANGEDATE);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.JobcandidateRecord> PK_JobCandidate_JobCandidateID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Jobcandidate.JOBCANDIDATE, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Jobcandidate.JOBCANDIDATE.JOBCANDIDATEID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.ShiftRecord> PK_Shift_ShiftID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Shift.SHIFT, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Shift.SHIFT.SHIFTID);

	// FOREIGN KEY definitions
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeeRecord, org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContactRecord> FK_Employee_Contact_ContactID = createForeignKey(org.jooq.examples.sqlserver.adventureworks.person.Keys.PK_Contact_ContactID, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.EMPLOYEE, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.EMPLOYEE.CONTACTID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeeRecord, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeeRecord> FK_Employee_Employee_ManagerID = createForeignKey(PK_Employee_EmployeeID, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.EMPLOYEE, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.EMPLOYEE.MANAGERID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeeaddressRecord, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeeRecord> FK_EmployeeAddress_Employee_EmployeeID = createForeignKey(PK_Employee_EmployeeID, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employeeaddress.EMPLOYEEADDRESS, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employeeaddress.EMPLOYEEADDRESS.EMPLOYEEID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeeaddressRecord, org.jooq.examples.sqlserver.adventureworks.person.tables.records.AddressRecord> FK_EmployeeAddress_Address_AddressID = createForeignKey(org.jooq.examples.sqlserver.adventureworks.person.Keys.PK_Address_AddressID, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employeeaddress.EMPLOYEEADDRESS, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employeeaddress.EMPLOYEEADDRESS.ADDRESSID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeedepartmenthistoryRecord, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeeRecord> FK_EmployeeDepartmentHistory_Employee_EmployeeID = createForeignKey(PK_Employee_EmployeeID, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employeedepartmenthistory.EMPLOYEEDEPARTMENTHISTORY, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employeedepartmenthistory.EMPLOYEEDEPARTMENTHISTORY.EMPLOYEEID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeedepartmenthistoryRecord, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.DepartmentRecord> FK_EmployeeDepartmentHistory_Department_DepartmentID = createForeignKey(PK_Department_DepartmentID, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employeedepartmenthistory.EMPLOYEEDEPARTMENTHISTORY, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employeedepartmenthistory.EMPLOYEEDEPARTMENTHISTORY.DEPARTMENTID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeedepartmenthistoryRecord, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.ShiftRecord> FK_EmployeeDepartmentHistory_Shift_ShiftID = createForeignKey(PK_Shift_ShiftID, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employeedepartmenthistory.EMPLOYEEDEPARTMENTHISTORY, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employeedepartmenthistory.EMPLOYEEDEPARTMENTHISTORY.SHIFTID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeepayhistoryRecord, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeeRecord> FK_EmployeePayHistory_Employee_EmployeeID = createForeignKey(PK_Employee_EmployeeID, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employeepayhistory.EMPLOYEEPAYHISTORY, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employeepayhistory.EMPLOYEEPAYHISTORY.EMPLOYEEID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.JobcandidateRecord, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeeRecord> FK_JobCandidate_Employee_EmployeeID = createForeignKey(PK_Employee_EmployeeID, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Jobcandidate.JOBCANDIDATE, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Jobcandidate.JOBCANDIDATE.EMPLOYEEID);

	/**
	 * No instances
	 */
	private Keys() {}
}
