
public class Programmers_20191109 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		
		System.out.println(solution(skill, skill_trees));
	}
	
	public static int solution(String skill, String[] skill_trees) {
        int answer = 0;

        // skill_trees ��ŭ isCorrect �Լ��� �����Ű��
        // ���� ���� True�� ���� ������ ��ų Ʈ���� ������ ����
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
		
		// Loop�� ���� �־��� ��ų ������ ���ϸ�
		// ��ų�� ���� ������ ���� ��� ��� Loop�� ����
		// ��ų�� ���� ������ ���� ���� ��� False�� ����
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
