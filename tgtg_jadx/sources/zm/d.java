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
import pg.y1;
import yi.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzm/d;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y1 f47992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f47993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f47994c;

    public d() {
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        this.f47993b = new Handler(looperMyLooper);
        this.f47994c = new a0(this, 8);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        int i11 = y1.f35279t;
        DataBinderMapperImpl dataBinderMapperImpl = a8.c.f965a;
        y1 y1Var = (y1) k.Z(layoutInflater, R.layout.manufacturer_about3, viewGroup, false, null);
        this.f47992a = y1Var;
        y1Var.getClass();
        View view = y1Var.f986f;
        view.getClass();
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.f47993b.removeCallbacks(this.f47994c);
    }
}
