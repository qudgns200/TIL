
public class Programmers_20191109 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		
		System.out.println(solution(skill, skill_trees));
	}
	
	public static int solution(String skill, String[] skill_trees) {
        int answer = 0;

        // skill_trees 만큼 isCorrect 함수를 실행시키고
        // 리턴 값이 True일 때만 가능한 스킬 트리의 개수를 증가
        for(int i=0; i<skill_trees.length; i++) {
        	if(isCorrect(skill, skill_trees[i])) answer++;
        }
        
        return answer;
    }
	
	public static boolean isCorrect(String skill, String skill_tree) {
		
		int beforeSkill = 0;
		int currentSkill = 0;
		boolean skillCheck = true;
		
		for(int i=0; i<skill_tree.length(); i++) {
			currentSkill = skill.indexOf(skill_tree.charAt(i));
			
			if(currentSkill == -1) continue;
			else if(beforeSkill < currentSkill) {
				skillCheck = false;
				break;
			} else if(beforeSkill == currentSkill) {
				beforeSkill++;
			}
		}
		
		// Loop를 돌며 주어진 스킬 순서를 비교하며
		// 스킬에 대한 순서가 맞을 경우 계속 Loop를 돌며
		// 스킬에 대한 순서가 맞지 않을 경우 False를 리턴
//		for(int i=0; i<skill.length(); i++) {
//			currentSkill = skill_tree.indexOf(skill.charAt(i));
//			
//			if(beforeSkill > currentSkill) {
//				skillCheck = false;
//				break;
//			} else {
//				beforeSkill = currentSkill;
//			}
//		}	
		
		return skillCheck;
	}
}
