package a8;

import android.view.View;
import androidx.databinding.DataBinderMapperImpl;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DataBinderMapperImpl f965a;

    static {
        DataBinderMapperImpl dataBinderMapperImpl = new DataBinderMapperImpl();
        dataBinderMapperImpl.f2922a = new HashSet();
        dataBinderMapperImpl.f2923b = new CopyOnWriteArrayList();
        dataBinderMapperImpl.f2924c = new CopyOnWriteArrayList();
        dataBinderMapperImpl.d(new com.app.tgtg.DataBinderMapperImpl());
        f965a = dataBinderMapperImpl;
    }

    public static k a(int i11, View view) {
        return f965a.b(i11, view);
    }
}
