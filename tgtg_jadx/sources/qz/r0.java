package qz;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r0 extends Fragment implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f37386b = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3.j f37387a = new a3.j(9, (byte) 0);

    @Override // qz.j
    public final i c(Class cls, String str) {
        return (i) cls.cast(((Map) this.f37387a.f399c).get(str));
    }

    @Override // androidx.fragment.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.f37387a.f399c).values().iterator();
        while (it.hasNext()) {
            ((i) it.next()).getClass();
        }
    }

    @Override // qz.j
    public final void h(String str, i iVar) {
        this.f37387a.w(str, iVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        Iterator it = ((Map) this.f37387a.f399c).values().iterator();
        while (it.hasNext()) {
            ((i) it.next()).c(i11, i12, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f37387a.x(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a3.j jVar = this.f37387a;
        jVar.f398b = 5;
        Iterator it = ((Map) jVar.f399c).values().iterator();
        while (it.hasNext()) {
            ((i) it.next()).getClass();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        a3.j jVar = this.f37387a;
        jVar.f398b = 3;
        Iterator it = ((Map) jVar.f399c).values().iterator();
        while (it.hasNext()) {
            ((i) it.next()).e();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f37387a.y(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        a3.j jVar = this.f37387a;
        jVar.f398b = 2;
        Iterator it = ((Map) jVar.f399c).values().iterator();
        while (it.hasNext()) {
            ((i) it.next()).g();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        a3.j jVar = this.f37387a;
        jVar.f398b = 4;
        Iterator it = ((Map) jVar.f399c).values().iterator();
        while (it.hasNext()) {
            ((i) it.next()).h();
        }
    }
}
