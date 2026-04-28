package androidx.core.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import com.braze.h2;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class TaskStackBuilder implements Iterable<Intent> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2574a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f2575b;

    public TaskStackBuilder(Context context) {
        this.f2575b = context;
    }

    public final void b(ComponentName componentName) {
        Context context = this.f2575b;
        ArrayList arrayList = this.f2574a;
        int size = arrayList.size();
        try {
            for (Intent intentD = e.d(context, componentName); intentD != null; intentD = e.d(context, intentD.getComponent())) {
                arrayList.add(size, intentD);
            }
        } catch (PackageManager.NameNotFoundException e5) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e5);
        }
    }

    public final void c() {
        ArrayList arrayList = this.f2574a;
        if (arrayList.isEmpty()) {
            h2.b("No intents added to TaskStackBuilder; cannot startActivities");
            return;
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        this.f2575b.startActivities(intentArr, null);
    }

    @Override // java.lang.Iterable
    public final Iterator<Intent> iterator() {
        return this.f2574a.iterator();
    }
}
