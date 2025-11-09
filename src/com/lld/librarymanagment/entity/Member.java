package com.lld.librarymanagment.entity;

import com.lld.librarymanagment.enums.*;

import java.time.LocalDate;

public class Member {
    private int memberId;
    private Roles roles;
    private String regNo;
    private LocalDate memberShipDate;

    public Member() {
    }

    public Member(int memberId, Roles roles, String regNo, LocalDate memberShipDate) {
        this.memberId = memberId;
        this.roles = roles;
        this.regNo = regNo;
        this.memberShipDate = memberShipDate;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public LocalDate getMemberShipDate() {
        return memberShipDate;
    }

    public void setMemberShipDate(LocalDate memberShipDate) {
        this.memberShipDate = memberShipDate;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", roles=" + roles +
                ", regNo='" + regNo + '\'' +
                ", memberShipDate=" + memberShipDate +
                '}';
    }
}
