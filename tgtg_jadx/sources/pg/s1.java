package pg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.app.tgtg.R;
import com.app.tgtg.feature.locationpicker.LocationPickerOverlay;
import com.google.android.material.slider.Slider;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s1 implements sa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f35148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f35149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f35150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f35151e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f35152f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f35153g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f35154h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f35155i;

    public /* synthetic */ s1(ViewGroup viewGroup, ImageView imageView, View view, Object obj, View view2, Object obj2, View view3, View view4, int i11) {
        this.f35147a = i11;
        this.f35148b = viewGroup;
        this.f35149c = imageView;
        this.f35150d = view;
        this.f35151e = obj;
        this.f35152f = view2;
        this.f35153g = obj2;
        this.f35154h = view3;
        this.f35155i = view4;
    }

    public static s1 a(LayoutInflater layoutInflater, uk.q qVar) {
        View viewInflate = layoutInflater.inflate(R.layout.location_picker_view, (ViewGroup) qVar, false);
        qVar.addView(viewInflate);
        int i11 = R.id.ibClose;
        ImageButton imageButton = (ImageButton) pd.g.t(R.id.ibClose, viewInflate);
        if (imageButton != null) {
            i11 = R.id.locationOverLay;
            LocationPickerOverlay locationPickerOverlay = (LocationPickerOverlay) pd.g.t(R.id.locationOverLay, viewInflate);
            if (locationPickerOverlay != null) {
                i11 = R.id.location_picker_bottom_sheet;
                View viewT = pd.g.t(R.id.location_picker_bottom_sheet, viewInflate);
                if (viewT != null) {
                    int i12 = R.id.bottomSheet;
                    if (((LinearLayout) pd.g.t(R.id.bottomSheet, viewT)) != null) {
                        LinearLayout linearLayout = (LinearLayout) viewT;
                        i12 = R.id.btnHideBottomSheet;
                        ImageView imageView = (ImageView) pd.g.t(R.id.btnHideBottomSheet, viewT);
                        if (imageView != null) {
                            i12 = R.id.btnUseMarkedLocation;
                            Button button = (Button) pd.g.t(R.id.btnUseMarkedLocation, viewT);
                            if (button != null) {
                                i12 = R.id.distanceLabel;
                                TextView textView = (TextView) pd.g.t(R.id.distanceLabel, viewT);
                                if (textView != null) {
                                    i12 = R.id.distancePicker;
                                    Slider slider = (Slider) pd.g.t(R.id.distancePicker, viewT);
                                    if (slider != null) {
                                        i12 = R.id.distancePickerBox;
                                        LinearLayout linearLayout2 = (LinearLayout) pd.g.t(R.id.distancePickerBox, viewT);
                                        if (linearLayout2 != null) {
                                            i12 = R.id.divider;
                                            if (((ImageView) pd.g.t(R.id.divider, viewT)) != null) {
                                                i12 = R.id.locationList;
                                                ListView listView = (ListView) pd.g.t(R.id.locationList, viewT);
                                                if (listView != null) {
                                                    i12 = R.id.osmAttribution;
                                                    TextView textView2 = (TextView) pd.g.t(R.id.osmAttribution, viewT);
                                                    if (textView2 != null) {
                                                        i12 = R.id.progress;
                                                        ProgressBar progressBar = (ProgressBar) pd.g.t(R.id.progress, viewT);
                                                        if (progressBar != null) {
                                                            i12 = R.id.searchField;
                                                            EditText editText = (EditText) pd.g.t(R.id.searchField, viewT);
                                                            if (editText != null) {
                                                                i12 = R.id.searchFieldError;
                                                                TextView textView3 = (TextView) pd.g.t(R.id.searchFieldError, viewT);
                                                                if (textView3 != null) {
                                                                    i12 = R.id.tvHintText;
                                                                    TextView textView4 = (TextView) pd.g.t(R.id.tvHintText, viewT);
                                                                    if (textView4 != null) {
                                                                        i12 = R.id.tvUseCurrentLocationBtn;
                                                                        Button button2 = (Button) pd.g.t(R.id.tvUseCurrentLocationBtn, viewT);
                                                                        if (button2 != null) {
                                                                            r1 r1Var = new r1(linearLayout, linearLayout, imageView, button, textView, slider, linearLayout2, listView, textView2, progressBar, editText, textView3, textView4, button2);
                                                                            i11 = R.id.mapViewContainer;
                                                                            FrameLayout frameLayout = (FrameLayout) pd.g.t(R.id.mapViewContainer, viewInflate);
                                                                            if (frameLayout != null) {
                                                                                i11 = R.id.marker;
                                                                                ImageView imageView2 = (ImageView) pd.g.t(R.id.marker, viewInflate);
                                                                                if (imageView2 != null) {
                                                                                    i11 = R.id.relativeLayout;
                                                                                    if (((ConstraintLayout) pd.g.t(R.id.relativeLayout, viewInflate)) != null) {
                                                                                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) viewInflate;
                                                                                        i11 = R.id.shadowMarker;
                                                                                        ImageView imageView3 = (ImageView) pd.g.t(R.id.shadowMarker, viewInflate);
                                                                                        if (imageView3 != null) {
                                                                                            i11 = R.id.title;
                                                                                            if (((TextView) pd.g.t(R.id.title, viewInflate)) != null) {
                                                                                                i11 = R.id.topPanel;
                                                                                                RelativeLayout relativeLayout = (RelativeLayout) pd.g.t(R.id.topPanel, viewInflate);
                                                                                                if (relativeLayout != null) {
                                                                                                    return new s1(coordinatorLayout, imageButton, locationPickerOverlay, r1Var, frameLayout, imageView2, imageView3, relativeLayout, 0);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    c50.w.l("Missing required view with ID: ".concat(viewT.getResources().getResourceName(i12)));
                    return null;
                }
            }
        }
        c50.w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
        return null;
    }

    @Override // sa.a
    public final View getRoot() {
        switch (this.f35147a) {
        }
        return (ConstraintLayout) this.f35148b;
    }
}
