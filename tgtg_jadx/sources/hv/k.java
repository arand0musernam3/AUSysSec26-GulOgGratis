package hv;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import zendesk.messaging.android.push.PushNotifications;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k implements OnCompleteListener, s.a {
    public static /* synthetic */ void a(StringBuilder sb2, Object obj, Object obj2) {
        sb2.append(obj);
        sb2.append(obj2);
        throw new IllegalStateException(sb2.toString().toString());
    }

    @Override // s.a
    /* JADX INFO: renamed from: apply */
    public Object mo962apply(Object obj) {
        return i1.h.f22777b;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        task.getClass();
        if (task.isSuccessful()) {
            String str = (String) task.getResult();
            str.getClass();
            PushNotifications.updatePushNotificationToken(str);
        }
    }
}
