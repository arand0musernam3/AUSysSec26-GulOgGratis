package zm;

import a8.k;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.Fragment;
import com.app.tgtg.R;
import kotlin.Metadata;
import pg.w1;
import yi.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzm/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w1 f47983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f47984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f47985c;

    public a() {
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        this.f47984b = new Handler(looperMyLooper);
        this.f47985c = new a0(this, 7);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        int i11 = w1.f35249t;
        DataBinderMapperImpl dataBinderMapperImpl = a8.c.f965a;
        w1 w1Var = (w1) k.Z(layoutInflater, R.layout.manufacturer_about1, viewGroup, false, null);
        this.f47983a = w1Var;
        w1Var.getClass();
        View view = w1Var.f986f;
        view.getClass();
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.f47984b.removeCallbacks(this.f47985c);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f47984b.postDelayed(this.f47985c, 1000L);
    }
}
