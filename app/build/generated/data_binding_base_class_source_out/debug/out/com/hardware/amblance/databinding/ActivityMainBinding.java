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
import com.hardware.amblance.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button loginmain;

  @NonNull
  public final LottieAnimationView lottie1;

  @NonNull
  public final Button signupmain;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull Button loginmain,
      @NonNull LottieAnimationView lottie1, @NonNull Button signupmain) {
    this.rootView = rootView;
    this.loginmain = loginmain;
    this.lottie1 = lottie1;
    this.signupmain = signupmain;
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
      id = R.id.loginmain;
      Button loginmain = ViewBindings.findChildViewById(rootView, id);
      if (loginmain == null) {
        break missingId;
      }

      id = R.id.lottie1;
      LottieAnimationView lottie1 = ViewBindings.findChildViewById(rootView, id);
      if (lottie1 == null) {
        break missingId;
      }

      id = R.id.signupmain;
      Button signupmain = ViewBindings.findChildViewById(rootView, id);
      if (signupmain == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, loginmain, lottie1, signupmain);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
