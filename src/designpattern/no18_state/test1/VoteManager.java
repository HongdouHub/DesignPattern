package designpattern.no18_state.test1;

import java.util.HashMap;
import java.util.Map;

public class VoteManager {

    private Map<String, String> mapVote;        // 记录用户投票的结果，对应<用户名称， 投票的选项>
    private Map<String, Integer> mapVoteCount;  // 记录用户投票的次数，对应<用户名称， 投票的次数>

    public VoteManager() {
        mapVote = new HashMap<String, String>();
        mapVoteCount = new HashMap<String, Integer>();
    }

    public void vote(String userName, String voteItem) {
        int count = addVoteCount(userName);
        if (count <= 1) {
            mapVote.put(userName, voteItem);
            System.out.println("投票成功");
        } else if (count < 5) {
            System.out.println("重复投票");
        } else if (count < 8) {
            String oldVoteItem = mapVote.get(userName);
            if (oldVoteItem != null) {
                mapVote.remove(userName);
            }
            System.out.println("恶意刷票");
        } else {
            System.out.println("进入黑名单");
        }
    }

    private int addVoteCount(String userName) {
        Integer oldVoteCount = mapVoteCount.get(userName);
        int currentCount = oldVoteCount == null ? 1 : oldVoteCount + 1;
        mapVoteCount.put(userName, currentCount);
        return currentCount;
    }
}
