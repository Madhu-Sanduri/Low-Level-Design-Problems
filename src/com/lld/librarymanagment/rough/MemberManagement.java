//package com.lld.librarymanagment;
//
//import java.time.LocalDate;
//
//public class MemberManagement {
//    private int memberId;
//    private Roles role;
//    private LocalDate joinDate;
//    private String regNumber;
//
//
//
//    public MemberManagement() {
//    }
//
//    public MemberManagement(int memberId, Roles role, LocalDate joinDate, String regNumber) {
//        this.memberId = memberId;
//        this.role = role;
//        this.joinDate = joinDate;
//        this.regNumber = regNumber;
//    }
//
//    public int getMemberId() {
//        return memberId;
//    }
//
//    public void setMemberId(int memberId) {
//        this.memberId = memberId;
//    }
//
//    public Roles getRole() {
//        return role;
//    }
//
//    public void setRole(Roles role) {
//        this.role = role;
//    }
//
//    public LocalDate getJoinDate() {
//        return joinDate;
//    }
//
//    public void setJoinDate(LocalDate joinDate) {
//        this.joinDate = joinDate;
//    }
//
//    public String getRegNumber() {
//        return regNumber;
//    }
//
//    public void setRegNumber(String regNumber) {
//        this.regNumber = regNumber;
//    }
//
//    public void addMember(Roles role, LocalDate joinDate, String regNumber){
//        //database logic to save data
//    }
//
//    public void updateMember(int memberId){
//        setRole(Roles.ADMIN);
//        setJoinDate(LocalDate.now());
//    }
//
//    public void deleteMember(int memberId){
//        //database logic to remove data
//    }
//
//    public MemberManagement searchMember(int memberId){
//        return null;
//    }
//
//
//
//    @Override
//    public String toString() {
//        return "MemberManagement{" +
//                "memberId=" + memberId +
//                ", role='" + role + '\'' +
//                ", joinDate=" + joinDate +
//                ", regNumber='" + regNumber + '\'' +
//                '}';
//    }
//}
