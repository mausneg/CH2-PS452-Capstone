// Generated by view binder compiler. Do not edit!
package com.capstone.destimate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.capstone.destimate.R;
import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView cardView2;

  @NonNull
  public final Guideline guideline5;

  @NonNull
  public final ImageView imgMainUser;

  @NonNull
  public final ProgressBar pbMainFavorite;

  @NonNull
  public final ProgressBar pbMainNearby;

  @NonNull
  public final ProgressBar pbMainRekomendasi;

  @NonNull
  public final RecyclerView rvMainFavorite;

  @NonNull
  public final RecyclerView rvMainNearby;

  @NonNull
  public final RecyclerView rvMainRekomendasi;

  @NonNull
  public final SearchBar sbMain;

  @NonNull
  public final SearchView searchView;

  @NonNull
  public final TextView tvMainFavorite;

  @NonNull
  public final TextView tvMainGreeting;

  @NonNull
  public final TextView tvMainGreetingMessage;

  @NonNull
  public final TextView tvMainNearby;

  @NonNull
  public final TextView tvMainRekomendasi;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull CardView cardView2,
      @NonNull Guideline guideline5, @NonNull ImageView imgMainUser,
      @NonNull ProgressBar pbMainFavorite, @NonNull ProgressBar pbMainNearby,
      @NonNull ProgressBar pbMainRekomendasi, @NonNull RecyclerView rvMainFavorite,
      @NonNull RecyclerView rvMainNearby, @NonNull RecyclerView rvMainRekomendasi,
      @NonNull SearchBar sbMain, @NonNull SearchView searchView, @NonNull TextView tvMainFavorite,
      @NonNull TextView tvMainGreeting, @NonNull TextView tvMainGreetingMessage,
      @NonNull TextView tvMainNearby, @NonNull TextView tvMainRekomendasi) {
    this.rootView = rootView;
    this.cardView2 = cardView2;
    this.guideline5 = guideline5;
    this.imgMainUser = imgMainUser;
    this.pbMainFavorite = pbMainFavorite;
    this.pbMainNearby = pbMainNearby;
    this.pbMainRekomendasi = pbMainRekomendasi;
    this.rvMainFavorite = rvMainFavorite;
    this.rvMainNearby = rvMainNearby;
    this.rvMainRekomendasi = rvMainRekomendasi;
    this.sbMain = sbMain;
    this.searchView = searchView;
    this.tvMainFavorite = tvMainFavorite;
    this.tvMainGreeting = tvMainGreeting;
    this.tvMainGreetingMessage = tvMainGreetingMessage;
    this.tvMainNearby = tvMainNearby;
    this.tvMainRekomendasi = tvMainRekomendasi;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardView2;
      CardView cardView2 = ViewBindings.findChildViewById(rootView, id);
      if (cardView2 == null) {
        break missingId;
      }

      id = R.id.guideline5;
      Guideline guideline5 = ViewBindings.findChildViewById(rootView, id);
      if (guideline5 == null) {
        break missingId;
      }

      id = R.id.img_main_user;
      ImageView imgMainUser = ViewBindings.findChildViewById(rootView, id);
      if (imgMainUser == null) {
        break missingId;
      }

      id = R.id.pb_main_favorite;
      ProgressBar pbMainFavorite = ViewBindings.findChildViewById(rootView, id);
      if (pbMainFavorite == null) {
        break missingId;
      }

      id = R.id.pb_main_nearby;
      ProgressBar pbMainNearby = ViewBindings.findChildViewById(rootView, id);
      if (pbMainNearby == null) {
        break missingId;
      }

      id = R.id.pb_main_rekomendasi;
      ProgressBar pbMainRekomendasi = ViewBindings.findChildViewById(rootView, id);
      if (pbMainRekomendasi == null) {
        break missingId;
      }

      id = R.id.rv_main_favorite;
      RecyclerView rvMainFavorite = ViewBindings.findChildViewById(rootView, id);
      if (rvMainFavorite == null) {
        break missingId;
      }

      id = R.id.rv_main_nearby;
      RecyclerView rvMainNearby = ViewBindings.findChildViewById(rootView, id);
      if (rvMainNearby == null) {
        break missingId;
      }

      id = R.id.rv_main_rekomendasi;
      RecyclerView rvMainRekomendasi = ViewBindings.findChildViewById(rootView, id);
      if (rvMainRekomendasi == null) {
        break missingId;
      }

      id = R.id.sb_main;
      SearchBar sbMain = ViewBindings.findChildViewById(rootView, id);
      if (sbMain == null) {
        break missingId;
      }

      id = R.id.search_view;
      SearchView searchView = ViewBindings.findChildViewById(rootView, id);
      if (searchView == null) {
        break missingId;
      }

      id = R.id.tv_main_favorite;
      TextView tvMainFavorite = ViewBindings.findChildViewById(rootView, id);
      if (tvMainFavorite == null) {
        break missingId;
      }

      id = R.id.tv_main_greeting;
      TextView tvMainGreeting = ViewBindings.findChildViewById(rootView, id);
      if (tvMainGreeting == null) {
        break missingId;
      }

      id = R.id.tv_main_greeting_message;
      TextView tvMainGreetingMessage = ViewBindings.findChildViewById(rootView, id);
      if (tvMainGreetingMessage == null) {
        break missingId;
      }

      id = R.id.tv_main_nearby;
      TextView tvMainNearby = ViewBindings.findChildViewById(rootView, id);
      if (tvMainNearby == null) {
        break missingId;
      }

      id = R.id.tv_main_rekomendasi;
      TextView tvMainRekomendasi = ViewBindings.findChildViewById(rootView, id);
      if (tvMainRekomendasi == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, cardView2, guideline5,
          imgMainUser, pbMainFavorite, pbMainNearby, pbMainRekomendasi, rvMainFavorite,
          rvMainNearby, rvMainRekomendasi, sbMain, searchView, tvMainFavorite, tvMainGreeting,
          tvMainGreetingMessage, tvMainNearby, tvMainRekomendasi);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}