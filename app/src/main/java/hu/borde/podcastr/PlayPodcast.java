package hu.borde.podcastr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PlayPodcast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_play_podcast);

        findViewById(R.id.podcast_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PlayPodcast.this, PodcastActivity.class));
            }
        });

        findViewById(R.id.bookmark_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PlayPodcast.this, BookmarkActivity.class));
            }
        });

        findViewById(R.id.book_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PlayPodcast.this, BooksActivity.class));
            }
        });
    }
}
