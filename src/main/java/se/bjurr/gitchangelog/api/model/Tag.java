package se.bjurr.gitchangelog.api.model;

import java.io.Serializable;
import java.util.List;

import se.bjurr.gitchangelog.api.model.interfaces.IAuthors;
import se.bjurr.gitchangelog.api.model.interfaces.ICommits;
import se.bjurr.gitchangelog.api.model.interfaces.IIssues;

public class Tag implements ICommits, IAuthors, IIssues, Serializable {
 private static final long serialVersionUID = 2140208294219785889L;
 private final String annotation;
 private final List<Author> authors;
 private final List<Commit> commits;
 private final List<Issue> issues;
 private final List<IssueType> issueTypes;
 private final String name;

 public Tag(String name, String annotation, List<Commit> commits, List<Author> authors, List<Issue> issues,
   List<IssueType> issueTypes) {
  this.commits = commits;
  this.authors = authors;
  this.issues = issues;
  this.name = name;
  this.annotation = annotation;
  this.issueTypes = issueTypes;
 }

 public String getAnnotation() {
  return this.annotation;
 }

 @Override
 public List<Author> getAuthors() {
  return this.authors;
 }

 public Commit getCommit() {
  return this.commits.get(0);
 }

 @Override
 public List<Commit> getCommits() {
  return this.commits;
 }

 @Override
 public List<Issue> getIssues() {
  return this.issues;
 }

 public List<IssueType> getIssueTypes() {
  return this.issueTypes;
 }

 public String getName() {
  return this.name;
 }

 @Override
 public String toString() {
  return "name: " + this.name;
 }
}
