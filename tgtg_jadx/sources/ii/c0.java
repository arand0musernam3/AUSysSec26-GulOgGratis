package ii;

import android.app.Activity;
import android.widget.Toast;
import com.app.tgtg.R;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c0 implements y80.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f23888b;

    public /* synthetic */ c0(Activity activity, int i11) {
        this.f23887a = i11;
        this.f23888b = activity;
    }

    @Override // y80.j
    public final Object emit(Object obj, x70.c cVar) {
        int i11 = this.f23887a;
        Activity activity = this.f23888b;
        switch (i11) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    Toast.makeText(activity, activity != null ? activity.getString(R.string.generic_err_undefined_error) : null, 0).show();
                }
                break;
            case 1:
                if (((Boolean) obj).booleanValue()) {
                    Toast.makeText(activity, activity != null ? activity.getString(R.string.generic_err_undefined_error) : null, 0).show();
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    Toast.makeText(activity, activity.getString(R.string.generic_err_undefined_error), 0).show();
                }
                break;
        }
        return Unit.f26487a;
    }
}
