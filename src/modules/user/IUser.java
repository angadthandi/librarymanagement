package modules.user;

public interface IUser {
    String registerMember(String name); // memberID
    void unRegisterMember(String memberID);
    UserData getUserData();
}