package designpattern.no18_state.test2;

public class BlackVoteState implements VoteState {
    @Override
    public void vote(String userName, String voteItem, VoteManager manager) {
        System.out.println("进入黑名单");
    }
}
