// Generated by view binder compiler. Do not edit!
package com.hardware.amblance.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.hardware.amblance.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button SubmitBtton;

  @NonNull
  public final TextInputEditText email;

  @NonNull
  public final LottieAnimationView lottie2;

  @NonNull
  public final TextInputEditText password;

  @NonNull
  public final TextInputLayout textInputLayout;

  @NonNull
  public final TextInputLayout textInputLayout4;

  private ActivityLoginBinding(@NonNull ConstraintLayout rootView, @NonNull Button SubmitBtton,
      @NonNull TextInputEditText email, @NonNull LottieAnimationView lottie2,
      @NonNull TextInputEditText password, @NonNull TextInputLayout textInputLayout,
      @NonNull TextInputLayout textInputLayout4) {
    this.rootView = rootView;
    this.SubmitBtton = SubmitBtton;
    this.email = email;
    this.lottie2 = lottie2;
    this.password = password;
    this.textInputLayout = textInputLayout;
    this.textInputLayout4 = textInputLayout4;
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
      id = R.id.Submit_btton;
      Button SubmitBtton = ViewBindings.findChildViewById(rootView, id);
      if (SubmitBtton == null) {
        break missingId;
      }

      id = R.id.email;
      TextInputEditText email = ViewBindings.findChildViewById(rootView, id);
      if (email == null) {
        break missingId;
      }

      id = R.id.lottie2;
      LottieAnimationView lottie2 = ViewBindings.findChildViewById(rootView, id);
      if (lottie2 == null) {
        break missingId;
      }

      id = R.id.password;
      TextInputEditText password = ViewBindings.findChildViewById(rootView, id);
      if (password == null) {
        break missingId;
      }

      id = R.id.textInputLayout;
      TextInputLayout textInputLayout = ViewBindings.findChildViewById(rootView, id);
      if (textInputLayout == null) {
        break missingId;
      }

      id = R.id.textInputLayout4;
      TextInputLayout textInputLayout4 = ViewBindings.findChildViewById(rootView, id);
      if (textInputLayout4 == null) {
        break missingId;
      }

      return new ActivityLoginBinding((ConstraintLayout) rootView, SubmitBtton, email, lottie2,
          password, textInputLayout, textInputLayout4);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
