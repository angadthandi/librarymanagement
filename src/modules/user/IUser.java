package modules.user;

public interface IUser {
    int registerMember(String name); // memberID
    void unRegisterMember(String memberID);
    UserData getUserData();
}