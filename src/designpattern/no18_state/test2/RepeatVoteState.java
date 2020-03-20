package designpattern.no18_state.test2;

public class RepeatVoteState implements VoteState {
    @Override
    public void vote(String userName, String voteItem, VoteManager manager) {
        System.out.println("重复投票");
    }
}
