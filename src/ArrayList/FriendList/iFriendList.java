package ArrayList.FriendList;

public interface iFriendList {
    //This method  will add a friend to your friendList...
      boolean acceptFriendRequest(Contact contact);
      //This method will remove a friend from your friendList by position...
      void removeFromFriendList(int position);
      //this method will remove the Friend fro List by his name ....
      void removeFromFriendList(String contactName);
      //This method will search a friend in your friendList ....
      int findFriend(Contact contact);
      int findFriend(String contactName);
}
