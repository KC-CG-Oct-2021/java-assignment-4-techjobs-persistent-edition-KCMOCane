-- Part 1: Test it with SQL
id, int
employer, varchar
name, varchar
skills, varchar
-- Part 2: Test it with SQL
--SELECT * FROM techjobs.employer
--WHERE location = "St. Louis City";
SELECT name FROM employer WHERE location = "St. Louis City";
-- Part 3: Test it with SQL
--DROP TABLE techjobs.job;
DROP TABLE job;
-- Part 4: Test it with SQL
--SELECT * FROM techjobs.job, techjobs.skill
--WHERE techjobs.job.name = techjobs.skill.name & techjobs.skill.name IS NOT NULL
--ORDER BY techjobs.skill.name asc;
SELECT * FROM skill LEFT JOIN job_skills ON skill.id = job_skills.skills_id WHERE job_skills.jobs_id IS NOT NULL ORDER BY name ASC;