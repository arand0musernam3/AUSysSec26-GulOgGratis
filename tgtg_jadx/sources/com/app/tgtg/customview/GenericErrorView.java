package com.app.tgtg.customview;

import a3.x0;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.e;
import bg.y;
import c50.w;
import com.airbnb.lottie.LottieAnimationView;
import com.app.tgtg.R;
import com.app.tgtg.customview.GenericErrorView;
import com.app.tgtg.model.local.AppConstants;
import com.app.tgtg.model.local.GenericErrors;
import e40.a;
import ft.j;
import he.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mv.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pd.g;
import pg.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class GenericErrorView extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f8906b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f8907a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenericErrorView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.generic_error_view, (ViewGroup) this, false);
        addView(viewInflate);
        int i12 = R.id.content;
        LinearLayout linearLayout = (LinearLayout) g.t(R.id.content, viewInflate);
        if (linearLayout != null) {
            i12 = R.id.errorActionBtn;
            Button button = (Button) g.t(R.id.errorActionBtn, viewInflate);
            if (button != null) {
                i12 = R.id.errorAnimation;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) g.t(R.id.errorAnimation, viewInflate);
                if (lottieAnimationView != null) {
                    i12 = R.id.errorImage;
                    ImageView imageView = (ImageView) g.t(R.id.errorImage, viewInflate);
                    if (imageView != null) {
                        i12 = R.id.errorMessage;
                        TextView textView = (TextView) g.t(R.id.errorMessage, viewInflate);
                        if (textView != null) {
                            i12 = R.id.errorTitle;
                            TextView textView2 = (TextView) g.t(R.id.errorTitle, viewInflate);
                            if (textView2 != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                i12 = R.id.graphicsLayout;
                                if (((ConstraintLayout) g.t(R.id.graphicsLayout, viewInflate)) != null) {
                                    this.f8907a = new c(constraintLayout, linearLayout, button, lottieAnimationView, imageView, textView, textView2, 2);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i12)));
        throw null;
    }

    private final void setErrorImage(int i11) {
        c cVar = this.f8907a;
        ((ImageView) cVar.f34805f).setVisibility(0);
        ((LottieAnimationView) cVar.f34804e).setVisibility(8);
        ((ImageView) cVar.f34805f).setImageResource(i11);
    }

    public final void j(String str) {
        c cVar = this.f8907a;
        ((ImageView) cVar.f34805f).setVisibility(8);
        o.b(getContext(), str).b(new y(cVar, 0));
    }

    public final void k(GenericErrors genericErrors) {
        genericErrors.getClass();
        boolean z11 = genericErrors instanceof GenericErrors.Generic;
        final int i11 = 0;
        c cVar = this.f8907a;
        if (z11) {
            j("sad_smiley_blob.json");
            ((TextView) cVar.f34807h).setText(R.string.generic_err_undefined_error);
            ((TextView) cVar.f34806g).setVisibility(8);
            Button button = (Button) cVar.f34803d;
            button.setVisibility(8);
            button.setClickable(false);
        } else if (genericErrors instanceof GenericErrors.Offline) {
            j("sad_smiley_blob.json");
            ((TextView) cVar.f34807h).setText(R.string.browse_list_no_internet_title);
            ((TextView) cVar.f34806g).setText(R.string.browse_list_no_internet_message);
            Button button2 = (Button) cVar.f34803d;
            button2.setVisibility(8);
            button2.setClickable(false);
        } else if (genericErrors instanceof GenericErrors.NoResultWithFilterOn) {
            j("sad_smiley_blob.json");
            ((TextView) cVar.f34807h).setText(R.string.browse_list_error_no_results_filter_title);
            ((TextView) cVar.f34806g).setText(R.string.browse_list_error_no_results_filter_message);
            Button button3 = (Button) cVar.f34803d;
            button3.setText(R.string.browse_list_error_no_results_filter_action_text);
            d.x(button3, new x0((GenericErrors.NoResultWithFilterOn) genericErrors, 24));
        } else if (genericErrors instanceof GenericErrors.NoResultWithDiscoverSearch) {
            j("sad_smiley_blob.json");
            ((TextView) cVar.f34807h).setText(R.string.browse_list_error_no_results_discover_search_title);
            ((TextView) cVar.f34806g).setVisibility(8);
            Button button4 = (Button) cVar.f34803d;
            button4.setText(R.string.browse_list_error_no_results_discover_search_action_text);
            d.x(button4, new x0((GenericErrors.NoResultWithDiscoverSearch) genericErrors, 21));
        } else if (genericErrors instanceof GenericErrors.NoResultWithDiscoverSearchAndFilters) {
            j("sad_smiley_blob.json");
            ((TextView) cVar.f34807h).setText(R.string.search_list_error_no_results_discover_search_and_filters_title);
            ((TextView) cVar.f34806g).setText(R.string.search_list_error_no_results_discover_search_and_filters_massage);
            Button button5 = (Button) cVar.f34803d;
            button5.setText(R.string.search_list_error_no_results_discover_search_and_filters_action_text);
            d.x(button5, new x0((GenericErrors.NoResultWithDiscoverSearchAndFilters) genericErrors, 22));
        } else if (genericErrors instanceof GenericErrors.LocationNotAvailable) {
            j("sad_smiley_blob.json");
            ((TextView) cVar.f34807h).setText(R.string.generic_error_view_no_location_title);
            ((TextView) cVar.f34806g).setText(R.string.generic_error_view_no_location_description);
            Button button6 = (Button) cVar.f34803d;
            button6.setText(R.string.generic_error_view_no_location_cta);
            d.x(button6, new x0((GenericErrors.LocationNotAvailable) genericErrors, 17));
        } else if (genericErrors instanceof GenericErrors.LocationServiceNotAvailable) {
            j jVar = j.f17932h;
            j jVar2 = null;
            if (jVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("instance");
                jVar = null;
            }
            if (jVar.h()) {
                j jVar3 = j.f17932h;
                if (jVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("instance");
                } else {
                    jVar2 = jVar3;
                }
                if (!jVar2.i()) {
                    j("sad_smiley_blob.json");
                    TextView textView = (TextView) cVar.f34807h;
                    Button button7 = (Button) cVar.f34803d;
                    textView.setText(R.string.generic_error_view_no_gps_title);
                    ((TextView) cVar.f34806g).setText(R.string.generic_error_view_no_gps_description);
                    button7.setText(R.string.generic_error_view_no_gps_cta);
                    final int i12 = 1;
                    d.x(button7, new Function1(this) { // from class: bg.x

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ GenericErrorView f6245b;

                        {
                            this.f6245b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            int i13 = i12;
                            GenericErrorView genericErrorView = this.f6245b;
                            View view = (View) obj;
                            switch (i13) {
                                case 0:
                                    int i14 = GenericErrorView.f8906b;
                                    view.getClass();
                                    Context contextD = p70.g.d(genericErrorView.getContext());
                                    contextD.getClass();
                                    k0 k0Var = new k0((Activity) contextD);
                                    k0Var.e(R.string.generic_error_view_alert_go_to_settings_title);
                                    k0Var.a(R.string.generic_error_view_alert_go_to_settings_description);
                                    k0Var.c(R.string.generic_error_view_alert_go_to_settings_positive_btn);
                                    k0Var.l = new aa.e(genericErrorView, 14);
                                    k0Var.b(R.string.generic_error_view_alert_go_to_settings_negative_btn);
                                    k0Var.f();
                                    break;
                                case 1:
                                    int i15 = GenericErrorView.f8906b;
                                    view.getClass();
                                    Context contextD2 = p70.g.d(genericErrorView.getContext());
                                    contextD2.getClass();
                                    Activity activity = (Activity) contextD2;
                                    ft.j jVar4 = ft.j.f17932h;
                                    if (jVar4 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("instance");
                                        jVar4 = null;
                                    }
                                    jVar4.c(activity);
                                    break;
                                default:
                                    int i16 = GenericErrorView.f8906b;
                                    view.getClass();
                                    Context contextD3 = p70.g.d(genericErrorView.getContext());
                                    contextD3.getClass();
                                    androidx.core.app.e.k((Activity) contextD3, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, AppConstants.PERMISSIONS_REQUEST_USE_LOCATION);
                                    ft.c.Q();
                                    break;
                            }
                            return Unit.f26487a;
                        }
                    });
                }
            } else {
                Context contextD = p70.g.d(getContext());
                contextD.getClass();
                if (e.l((Activity) contextD, "android.permission.ACCESS_FINE_LOCATION") || !ft.c.m()) {
                    j("sad_smiley_blob.json");
                    TextView textView2 = (TextView) cVar.f34807h;
                    Button button8 = (Button) cVar.f34803d;
                    textView2.setText(R.string.generic_error_view_no_gps_title);
                    ((TextView) cVar.f34806g).setText(R.string.generic_error_view_no_gps_description);
                    button8.setText(R.string.generic_error_view_no_gps_cta);
                    final int i13 = 2;
                    d.x(button8, new Function1(this) { // from class: bg.x

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ GenericErrorView f6245b;

                        {
                            this.f6245b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            int i132 = i13;
                            GenericErrorView genericErrorView = this.f6245b;
                            View view = (View) obj;
                            switch (i132) {
                                case 0:
                                    int i14 = GenericErrorView.f8906b;
                                    view.getClass();
                                    Context contextD2 = p70.g.d(genericErrorView.getContext());
                                    contextD2.getClass();
                                    k0 k0Var = new k0((Activity) contextD2);
                                    k0Var.e(R.string.generic_error_view_alert_go_to_settings_title);
                                    k0Var.a(R.string.generic_error_view_alert_go_to_settings_description);
                                    k0Var.c(R.string.generic_error_view_alert_go_to_settings_positive_btn);
                                    k0Var.l = new aa.e(genericErrorView, 14);
                                    k0Var.b(R.string.generic_error_view_alert_go_to_settings_negative_btn);
                                    k0Var.f();
                                    break;
                                case 1:
                                    int i15 = GenericErrorView.f8906b;
                                    view.getClass();
                                    Context contextD22 = p70.g.d(genericErrorView.getContext());
                                    contextD22.getClass();
                                    Activity activity = (Activity) contextD22;
                                    ft.j jVar4 = ft.j.f17932h;
                                    if (jVar4 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("instance");
                                        jVar4 = null;
                                    }
                                    jVar4.c(activity);
                                    break;
                                default:
                                    int i16 = GenericErrorView.f8906b;
                                    view.getClass();
                                    Context contextD3 = p70.g.d(genericErrorView.getContext());
                                    contextD3.getClass();
                                    androidx.core.app.e.k((Activity) contextD3, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, AppConstants.PERMISSIONS_REQUEST_USE_LOCATION);
                                    ft.c.Q();
                                    break;
                            }
                            return Unit.f26487a;
                        }
                    });
                } else {
                    j("sad_smiley_blob.json");
                    TextView textView3 = (TextView) cVar.f34807h;
                    Button button9 = (Button) cVar.f34803d;
                    textView3.setText(R.string.generic_error_view_no_gps_title);
                    ((TextView) cVar.f34806g).setText(R.string.generic_error_view_no_gps_description);
                    button9.setText(R.string.generic_error_view_no_gps_cta);
                    d.x(button9, new Function1(this) { // from class: bg.x

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ GenericErrorView f6245b;

                        {
                            this.f6245b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            int i132 = i11;
                            GenericErrorView genericErrorView = this.f6245b;
                            View view = (View) obj;
                            switch (i132) {
                                case 0:
                                    int i14 = GenericErrorView.f8906b;
                                    view.getClass();
                                    Context contextD2 = p70.g.d(genericErrorView.getContext());
                                    contextD2.getClass();
                                    k0 k0Var = new k0((Activity) contextD2);
                                    k0Var.e(R.string.generic_error_view_alert_go_to_settings_title);
                                    k0Var.a(R.string.generic_error_view_alert_go_to_settings_description);
                                    k0Var.c(R.string.generic_error_view_alert_go_to_settings_positive_btn);
                                    k0Var.l = new aa.e(genericErrorView, 14);
                                    k0Var.b(R.string.generic_error_view_alert_go_to_settings_negative_btn);
                                    k0Var.f();
                                    break;
                                case 1:
                                    int i15 = GenericErrorView.f8906b;
                                    view.getClass();
                                    Context contextD22 = p70.g.d(genericErrorView.getContext());
                                    contextD22.getClass();
                                    Activity activity = (Activity) contextD22;
                                    ft.j jVar4 = ft.j.f17932h;
                                    if (jVar4 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("instance");
                                        jVar4 = null;
                                    }
                                    jVar4.c(activity);
                                    break;
                                default:
                                    int i16 = GenericErrorView.f8906b;
                                    view.getClass();
                                    Context contextD3 = p70.g.d(genericErrorView.getContext());
                                    contextD3.getClass();
                                    androidx.core.app.e.k((Activity) contextD3, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, AppConstants.PERMISSIONS_REQUEST_USE_LOCATION);
                                    ft.c.Q();
                                    break;
                            }
                            return Unit.f26487a;
                        }
                    });
                }
            }
        } else if (genericErrors instanceof GenericErrors.NoResultsWithCurrentLocation) {
            j("map_blob.json");
            ((TextView) cVar.f34807h).setText(R.string.discover_not_live_here_title);
            ((TextView) cVar.f34806g).setText(R.string.browse_list_error_no_results_location_message);
            Button button10 = (Button) cVar.f34803d;
            button10.setText(R.string.browse_list_error_no_results_location_action_text);
            d.x(button10, new x0((GenericErrors.NoResultsWithCurrentLocation) genericErrors, 16));
        } else if (genericErrors instanceof GenericErrors.NoLocationSelected) {
            j("map_blob.json");
            ((TextView) cVar.f34807h).setText(R.string.browse_list_error_no_location_selected_title);
            ((TextView) cVar.f34806g).setText(R.string.browse_list_error_no_location_selected_message);
            Button button11 = (Button) cVar.f34803d;
            button11.setText(R.string.browse_list_error_no_location_selected_action_text);
            d.x(button11, new x0((GenericErrors.NoLocationSelected) genericErrors, 14));
        } else if (genericErrors instanceof GenericErrors.NoOrders) {
            setErrorImage(R.drawable.gfx_bag_icon);
            ((TextView) cVar.f34807h).setText(R.string.order_list_no_order_title);
            ((TextView) cVar.f34806g).setText(R.string.order_list_no_order_message);
            Button button12 = (Button) cVar.f34803d;
            button12.setText(R.string.order_list_no_order_btn);
            d.x(button12, new x0((GenericErrors.NoOrders) genericErrors, 19));
        } else if (genericErrors instanceof GenericErrors.NoCo2eSaved) {
            setErrorImage(R.drawable.gfx_earth_icon);
            ((TextView) cVar.f34807h).setText(R.string.co2e_saved_empty_title);
            ((TextView) cVar.f34806g).setText(R.string.co2e_saved_empty_message);
            Button button13 = (Button) cVar.f34803d;
            button13.setText(R.string.co2e_saved_empty_btn);
            d.x(button13, new x0((GenericErrors.NoCo2eSaved) genericErrors, 18));
        } else if (genericErrors instanceof GenericErrors.UnknownError) {
            j("sad_smiley_blob.json");
            ((TextView) cVar.f34807h).setText(R.string.generic_err_undefined_error);
            ((TextView) cVar.f34806g).setVisibility(8);
            Button button14 = (Button) cVar.f34803d;
            button14.setText(R.string.generic_error_view_no_location_cta);
            d.x(button14, new x0((GenericErrors.UnknownError) genericErrors, 13));
        } else if (genericErrors instanceof GenericErrors.NoRecipeFound) {
            setErrorImage(R.drawable.blob_doodle_meal);
            ((TextView) cVar.f34807h).setText(R.string.fridge_recipe_recipe_not_found_error_title);
            ((TextView) cVar.f34806g).setText(R.string.fridge_recipe_recipe_not_found_error_body);
            Button button15 = (Button) cVar.f34803d;
            button15.setText(R.string.fridge_recipe_recipe_not_found_error_button);
            d.x(button15, new x0((GenericErrors.NoRecipeFound) genericErrors, 15));
        } else if (genericErrors instanceof GenericErrors.NoRecipeSaved) {
            setErrorImage(R.drawable.blob_doodle_meal);
            ((TextView) cVar.f34807h).setText(R.string.recipe_save_empty_state_title);
            ((TextView) cVar.f34806g).setText(R.string.recipe_save_empty_state_body);
            Button button16 = (Button) cVar.f34803d;
            button16.setText(R.string.fridge_recipe_recipe_not_found_error_button);
            d.x(button16, new x0((GenericErrors.NoRecipeSaved) genericErrors, 23));
        } else if (genericErrors instanceof GenericErrors.SharedRecipeNotAvailable) {
            setErrorImage(R.drawable.blob_doodle_meal);
            ((TextView) cVar.f34807h).setText(R.string.shared_recipe_not_available_header);
            ((TextView) cVar.f34806g).setText(R.string.shared_recipe_not_available_body);
            Button button17 = (Button) cVar.f34803d;
            button17.setText(R.string.fridge_intro_cta_get_started);
            d.x(button17, new x0((GenericErrors.SharedRecipeNotAvailable) genericErrors, 20));
        } else if (!(genericErrors instanceof GenericErrors.MapViewTooWide)) {
            a.f();
            return;
        }
        setVisibility(0);
        ((LinearLayout) cVar.f34802c).requestLayout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GenericErrorView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GenericErrorView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ GenericErrorView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }
}
