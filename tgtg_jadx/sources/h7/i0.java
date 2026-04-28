package h7;

import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.credentials.CreateCredentialResponse;
import android.credentials.Credential;
import android.credentials.GetCredentialResponse;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Bundle;
import android.text.GraphemeClusterSegmentFinder;
import android.text.Layout;
import android.text.SegmentFinder;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.widget.TextView;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialException;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i0 {
    public static final void a(CursorAnchorInfo.Builder builder, m5.q0 q0Var, h4.c cVar) {
        if (cVar.h()) {
            return;
        }
        m5.r rVar = q0Var.f29618b;
        int i11 = rVar.f29628f - 1;
        if (i11 < 0) {
            i11 = 0;
        }
        int iC = n80.p.c(rVar.e(cVar.f21381b), 0, i11);
        int iC2 = n80.p.c(rVar.e(cVar.f21383d), 0, i11);
        if (iC > iC2) {
            return;
        }
        while (true) {
            builder.addVisibleLineBounds(q0Var.g(iC), rVar.f(iC), q0Var.h(iC), rVar.b(iC));
            if (iC == iC2) {
                return;
            } else {
                iC++;
            }
        }
    }

    public static Context b(Context context, int i11) {
        return context.createDeviceContext(i11);
    }

    public static CreateCredentialException c(Intent intent) {
        android.credentials.CreateCredentialException createCredentialException = (android.credentials.CreateCredentialException) intent.getSerializableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION", android.credentials.CreateCredentialException.class);
        if (createCredentialException == null) {
            return null;
        }
        String type = createCredentialException.getType();
        type.getClass();
        return o30.e0.G(createCredentialException.getMessage(), type);
    }

    public static n7.c d(String str, Intent intent) {
        CreateCredentialResponse createCredentialResponse = (CreateCredentialResponse) intent.getParcelableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE", CreateCredentialResponse.class);
        if (createCredentialResponse == null) {
            return null;
        }
        Bundle data = createCredentialResponse.getData();
        data.getClass();
        return p30.b.o(data, str);
    }

    public static GetCredentialException e(Intent intent) {
        android.credentials.GetCredentialException getCredentialException = (android.credentials.GetCredentialException) intent.getSerializableExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION", android.credentials.GetCredentialException.class);
        if (getCredentialException == null) {
            return null;
        }
        String type = getCredentialException.getType();
        type.getClass();
        return o30.e0.H(getCredentialException.getMessage(), type);
    }

    public static n7.t f(Intent intent) {
        GetCredentialResponse getCredentialResponse = (GetCredentialResponse) intent.getParcelableExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE", GetCredentialResponse.class);
        if (getCredentialResponse == null) {
            return null;
        }
        Credential credential = getCredentialResponse.getCredential();
        credential.getClass();
        String type = credential.getType();
        type.getClass();
        Bundle data = credential.getData();
        data.getClass();
        return new n7.t(pd.g.p(data, type));
    }

    public static JobScheduler g(JobScheduler jobScheduler) {
        jobScheduler.getClass();
        JobScheduler jobSchedulerForNamespace = jobScheduler.forNamespace("androidx.work.systemjobscheduler");
        jobSchedulerForNamespace.getClass();
        return jobSchedulerForNamespace;
    }

    public static AccessibilityNodeInfo.AccessibilityAction h() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static float i(VelocityTracker velocityTracker, int i11) {
        return velocityTracker.getAxisVelocity(i11);
    }

    public static void j(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence k(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static int l(Context context) {
        context.getClass();
        return context.getDeviceId();
    }

    public static int m(Context context) {
        return context.getDeviceId();
    }

    public static int[] n(n5.i iVar, RectF rectF, int i11, final lk.a aVar) {
        SegmentFinder graphemeClusterSegmentFinder;
        if (i11 == 1) {
            graphemeClusterSegmentFinder = new o5.a(new k8.d(25, iVar.f30531f.getText(), iVar.j()));
        } else {
            graphemeClusterSegmentFinder = new GraphemeClusterSegmentFinder(iVar.f30531f.getText(), iVar.f30526a);
        }
        return iVar.f30531f.getRangeForRect(rectF, graphemeClusterSegmentFinder, new Layout.TextInclusionStrategy() { // from class: n5.a
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return ((Boolean) aVar.invoke(rectF2, rectF3)).booleanValue();
            }
        });
    }

    public static int o(ViewConfiguration viewConfiguration, int i11, int i12, int i13) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i11, i12, i13);
    }

    public static int p(ViewConfiguration viewConfiguration, int i11, int i12, int i13) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i11, i12, i13);
    }

    public static boolean q(Bitmap bitmap) {
        return bitmap.hasGainmap();
    }

    public static boolean r(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static boolean s(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isRequestFromAccessibilityTool();
    }

    public static final void t(CameraCaptureSession.CaptureCallback captureCallback, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j9, long j11) {
        captureCallback.onReadoutStarted(cameraCaptureSession, captureRequest, j9, j11);
    }

    public static void u(AccessibilityEvent accessibilityEvent, boolean z11) {
        accessibilityEvent.setAccessibilityDataSensitive(z11);
    }

    public static void v(AccessibilityNodeInfo accessibilityNodeInfo, boolean z11) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(z11);
    }

    public static void w(TextView textView, int i11, float f11) {
        textView.setLineHeight(i11, f11);
    }

    public static final void x(LinkedHashMap linkedHashMap) {
        linkedHashMap.put(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1);
    }
}
