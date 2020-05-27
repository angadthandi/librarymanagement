package modules.user;

import modules.library.ILibrary;

public class User implements IUser {
    private UserData userData;
    private ILibrary library;

    public void User(ILibrary l) {
        library = l;
    }

    // memberID
    public String registerMember(String name) {
        int newUserID = library.totalUsers() + 1;
        String memberID = Integer.toString(newUserID);

        this.userData.memberID = memberID;
        this.userData.name = name;
        this.userData.userType = UserType.MEMBER;
        
        // add to usersList
        library.addUserToList(memberID, this);

        return memberID;
    }

    public void unRegisterMember(String memberID) {
        library.removeUserFromList(memberID);
    }

    public UserData getUserData() {
        return userData;
    }

}