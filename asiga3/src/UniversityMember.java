public abstract class UniversityMember {
    int numberOfMembers;
    int memberId;
    String memberName;

    UniversityMember(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.numberOfMembers = memberId;
    }

}
