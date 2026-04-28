package pg;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q3 extends a8.k {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f35081z = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ComposeView f35082s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ComposeView f35083t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final SwitchCompat f35084u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ComposeView f35085v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextView f35086w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final TextView f35087x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final TextView f35088y;

    public q3(a8.b bVar, View view, ComposeView composeView, ComposeView composeView2, SwitchCompat switchCompat, ComposeView composeView3, TextView textView, TextView textView2, TextView textView3) {
        super(0, view, bVar);
        this.f35082s = composeView;
        this.f35083t = composeView2;
        this.f35084u = switchCompat;
        this.f35085v = composeView3;
        this.f35086w = textView;
        this.f35087x = textView2;
        this.f35088y = textView3;
    }
}
