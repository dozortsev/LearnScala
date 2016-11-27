CREATE TABLE IF NOT EXISTS Tweet (
  id INT PRIMARY KEY AUTO_INCREMENT,
  author VARCHAR(40) NOT NULL,
  content VARCHAR(140) NOT NULL,
  created DATE NOT NULL
);

DELETE FROM Tweet;
INSERT INTO Tweet(author, content, created) VALUES
  ('mario_gotze', 'Hey there', date(20161210)),
  ('diego_costa', 'I\'m the best', date(20000210));
