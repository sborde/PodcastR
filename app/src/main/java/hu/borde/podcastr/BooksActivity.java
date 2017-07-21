package hu.borde.podcastr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BooksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_books);

        findViewById(R.id.podcast_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BooksActivity.this, PodcastActivity.class));
            }
        });

        findViewById(R.id.bookmark_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BooksActivity.this, BookmarkActivity.class));
            }
        });

        findViewById(R.id.nowplay_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BooksActivity.this, PlayPodcast.class));
            }
        });

        findViewById(R.id.buy_book_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BooksActivity.this, PaymentActivity.class));
            }
        });
    }
}
