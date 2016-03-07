package rest.pojos;

import java.util.Comparator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="scores")
@NamedQueries({@NamedQuery(name= "Score.getAllScores", query ="select s from Score s")})
public class Score implements Comparator<Score>
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int score;
	public Score(){
		
	}
	public Score(String name, int score ){
		this.name = name;
		this.score = score;
		
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getScore()
	{
		return score;
	}
	public void setScore(int score)
	{
		this.score = score;
	}
	public int getId()
	{
		return id;
	}
	@Override
	public String toString(){
		return "Name: " + this.name + " Score: " + this.score;
	}
	@Override
	public int compare(Score o1, Score o2)
	{
		// TODO Auto-generated method stub
		return  o2.getScore() - o1.getScore();
	}
	
}
