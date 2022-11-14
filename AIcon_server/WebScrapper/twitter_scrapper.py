import scrapper
import tweepy
import os
from dotenv import load_dotenv

load_dotenv()


class TweetScrap:
    def __init__(self):
        self.ids: int = 64331888  # 서울 메트로 트위터 아이디
        self.bearer_token = os.environ.get("bearer_token")
        self.consumer_key = os.environ.get("consumer_api_key")
        self.consumer_secret = os.environ.get("consumer_api_secret")
        self.access_token = os.environ.get("access_token")
        self.access_token_secret = os.environ.get("access_token_secret")
        self.api = self.__get_apis()

    def __get_apis(self):
        api = tweepy.Client(bearer_token=self.bearer_token,
                            consumer_key=self.consumer_key,
                            consumer_secret=self.consumer_secret,
                            access_token=self.access_token,
                            access_token_secret=self.access_token_secret)

        return api

    def get_tweets(self):
        id: int = self.ids
        tweets = self.api.get_users_tweets(id)
        # print(tweets)
        return tweets


if __name__ == "__main__":
    twitter = TweetScrap()
    ans = twitter.get_tweets()
    li = list(ans.data)
    for cnt, i in enumerate(li, 1):
        print(f"{cnt}\n{i}")
        print('======================')
