package _24.client.api.post.xml.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ProjectList {

	private List<Project> projectList;
	
	// default constructor is required.
	public ProjectList() {
		super();
	}

	public ProjectList(List<Project> projectList) {
		super();
		this.projectList = projectList;
	}


	public List<Project> getProjectList() {
		return projectList;
	}

	public void setProjectList(List<Project> projectList) {
		this.projectList = projectList;
	}

	@Override
	public String toString() {
		return "ProjectList [projectList=" + projectList + "]";
	}

}
