package hu.borde.podcastr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PodcastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_podcast);

        findViewById(R.id.book_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PodcastActivity.this, BooksActivity.class));
            }
        });

        findViewById(R.id.bookmark_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PodcastActivity.this, BookmarkActivity.class));
            }
        });

        findViewById(R.id.nowplay_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PodcastActivity.this, PlayPodcast.class));
            }
        });
    }
}
