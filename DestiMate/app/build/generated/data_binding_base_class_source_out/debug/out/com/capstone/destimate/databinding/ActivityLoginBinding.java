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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.capstone.destimate.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton btLoginLogin;

  @NonNull
  public final MaterialButton btLoginSignup;

  @NonNull
  public final TextInputEditText edLoginEmail;

  @NonNull
  public final TextInputEditText edLoginPassword;

  @NonNull
  public final TextInputLayout etlLoginEmail;

  @NonNull
  public final TextInputLayout etlLoginPassword;

  @NonNull
  public final Guideline guideline;

  @NonNull
  public final Guideline guideline2;

  @NonNull
  public final ImageView imgLoginHeader;

  @NonNull
  public final ProgressBar pbLogin;

  @NonNull
  public final TextView tvLoginMessage;

  @NonNull
  public final TextView tvLoginTitle;

  private ActivityLoginBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialButton btLoginLogin, @NonNull MaterialButton btLoginSignup,
      @NonNull TextInputEditText edLoginEmail, @NonNull TextInputEditText edLoginPassword,
      @NonNull TextInputLayout etlLoginEmail, @NonNull TextInputLayout etlLoginPassword,
      @NonNull Guideline guideline, @NonNull Guideline guideline2,
      @NonNull ImageView imgLoginHeader, @NonNull ProgressBar pbLogin,
      @NonNull TextView tvLoginMessage, @NonNull TextView tvLoginTitle) {
    this.rootView = rootView;
    this.btLoginLogin = btLoginLogin;
    this.btLoginSignup = btLoginSignup;
    this.edLoginEmail = edLoginEmail;
    this.edLoginPassword = edLoginPassword;
    this.etlLoginEmail = etlLoginEmail;
    this.etlLoginPassword = etlLoginPassword;
    this.guideline = guideline;
    this.guideline2 = guideline2;
    this.imgLoginHeader = imgLoginHeader;
    this.pbLogin = pbLogin;
    this.tvLoginMessage = tvLoginMessage;
    this.tvLoginTitle = tvLoginTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bt_login_login;
      MaterialButton btLoginLogin = ViewBindings.findChildViewById(rootView, id);
      if (btLoginLogin == null) {
        break missingId;
      }

      id = R.id.bt_login_signup;
      MaterialButton btLoginSignup = ViewBindings.findChildViewById(rootView, id);
      if (btLoginSignup == null) {
        break missingId;
      }

      id = R.id.ed_login_email;
      TextInputEditText edLoginEmail = ViewBindings.findChildViewById(rootView, id);
      if (edLoginEmail == null) {
        break missingId;
      }

      id = R.id.ed_login_password;
      TextInputEditText edLoginPassword = ViewBindings.findChildViewById(rootView, id);
      if (edLoginPassword == null) {
        break missingId;
      }

      id = R.id.etl_login_email;
      TextInputLayout etlLoginEmail = ViewBindings.findChildViewById(rootView, id);
      if (etlLoginEmail == null) {
        break missingId;
      }

      id = R.id.etl_login_password;
      TextInputLayout etlLoginPassword = ViewBindings.findChildViewById(rootView, id);
      if (etlLoginPassword == null) {
        break missingId;
      }

      id = R.id.guideline;
      Guideline guideline = ViewBindings.findChildViewById(rootView, id);
      if (guideline == null) {
        break missingId;
      }

      id = R.id.guideline2;
      Guideline guideline2 = ViewBindings.findChildViewById(rootView, id);
      if (guideline2 == null) {
        break missingId;
      }

      id = R.id.img_login_header;
      ImageView imgLoginHeader = ViewBindings.findChildViewById(rootView, id);
      if (imgLoginHeader == null) {
        break missingId;
      }

      id = R.id.pb_login;
      ProgressBar pbLogin = ViewBindings.findChildViewById(rootView, id);
      if (pbLogin == null) {
        break missingId;
      }

      id = R.id.tv_login_message;
      TextView tvLoginMessage = ViewBindings.findChildViewById(rootView, id);
      if (tvLoginMessage == null) {
        break missingId;
      }

      id = R.id.tv_login_title;
      TextView tvLoginTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvLoginTitle == null) {
        break missingId;
      }

      return new ActivityLoginBinding((ConstraintLayout) rootView, btLoginLogin, btLoginSignup,
          edLoginEmail, edLoginPassword, etlLoginEmail, etlLoginPassword, guideline, guideline2,
          imgLoginHeader, pbLogin, tvLoginMessage, tvLoginTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}