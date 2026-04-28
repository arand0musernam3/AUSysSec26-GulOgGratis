package oz;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements d10.b, d10.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ d f33811b = new d(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ d f33812c = new d(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ d f33813d = new d(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33814a;

    public /* synthetic */ d(int i11) {
        this.f33814a = i11;
    }

    @Override // d10.b
    public Object g(Task task) throws IOException {
        switch (this.f33814a) {
            case 0:
                if (task.isSuccessful()) {
                    return (Bundle) task.getResult();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(task.getException())));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
            default:
                Intent intent = (Intent) ((Bundle) task.getResult()).getParcelable("notification_data");
                if (intent != null) {
                    return new a(intent);
                }
                return null;
        }
    }

    @Override // d10.f
    public Task h(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i11 = b.f33800h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? Tasks.d(bundle) : Tasks.d(null);
    }
}
