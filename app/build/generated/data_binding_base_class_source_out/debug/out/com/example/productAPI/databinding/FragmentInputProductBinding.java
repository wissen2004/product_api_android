// Generated by view binder compiler. Do not edit!
package com.example.productAPI.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.productAPI.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentInputProductBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnAdd;

  @NonNull
  public final MaterialButton btnLoadPhoto;

  @NonNull
  public final TextInputEditText email;

  @NonNull
  public final ImageView imageInput;

  @NonNull
  public final TextInputEditText password;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final TextInputEditText userName;

  private FragmentInputProductBinding(@NonNull LinearLayout rootView, @NonNull Button btnAdd,
      @NonNull MaterialButton btnLoadPhoto, @NonNull TextInputEditText email,
      @NonNull ImageView imageInput, @NonNull TextInputEditText password,
      @NonNull ProgressBar progressBar, @NonNull TextInputEditText userName) {
    this.rootView = rootView;
    this.btnAdd = btnAdd;
    this.btnLoadPhoto = btnLoadPhoto;
    this.email = email;
    this.imageInput = imageInput;
    this.password = password;
    this.progressBar = progressBar;
    this.userName = userName;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentInputProductBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentInputProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_input_product, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentInputProductBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_add;
      Button btnAdd = ViewBindings.findChildViewById(rootView, id);
      if (btnAdd == null) {
        break missingId;
      }

      id = R.id.btn_load_photo;
      MaterialButton btnLoadPhoto = ViewBindings.findChildViewById(rootView, id);
      if (btnLoadPhoto == null) {
        break missingId;
      }

      id = R.id.email;
      TextInputEditText email = ViewBindings.findChildViewById(rootView, id);
      if (email == null) {
        break missingId;
      }

      id = R.id.image_input;
      ImageView imageInput = ViewBindings.findChildViewById(rootView, id);
      if (imageInput == null) {
        break missingId;
      }

      id = R.id.password;
      TextInputEditText password = ViewBindings.findChildViewById(rootView, id);
      if (password == null) {
        break missingId;
      }

      id = R.id.progress_bar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.user_name;
      TextInputEditText userName = ViewBindings.findChildViewById(rootView, id);
      if (userName == null) {
        break missingId;
      }

      return new FragmentInputProductBinding((LinearLayout) rootView, btnAdd, btnLoadPhoto, email,
          imageInput, password, progressBar, userName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
