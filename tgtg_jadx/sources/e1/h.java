package e1;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15449b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15450c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15451d = -1;

    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h(java.lang.String r8, java.lang.String r9) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.String r0 = "glAttachShader"
            java.lang.String r1 = "Could not link program: "
            r7.<init>()
            r2 = -1
            r7.f15449b = r2
            r7.f15450c = r2
            r7.f15451d = r2
            r3 = 35633(0x8b31, float:4.9932E-41)
            int r8 = e1.j.k(r3, r8)     // Catch: java.lang.IllegalArgumentException -> L6d java.lang.IllegalStateException -> L71
            r3 = 35632(0x8b30, float:4.9931E-41)
            int r9 = e1.j.k(r3, r9)     // Catch: java.lang.IllegalArgumentException -> L67 java.lang.IllegalStateException -> L6b
            int r3 = android.opengl.GLES20.glCreateProgram()     // Catch: java.lang.IllegalArgumentException -> L62 java.lang.IllegalStateException -> L65
            java.lang.String r4 = "glCreateProgram"
            e1.j.b(r4)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            android.opengl.GLES20.glAttachShader(r3, r8)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            e1.j.b(r0)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            android.opengl.GLES20.glAttachShader(r3, r9)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            e1.j.b(r0)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            android.opengl.GLES20.glLinkProgram(r3)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            r0 = 1
            int[] r4 = new int[r0]     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            r5 = 35714(0x8b82, float:5.0046E-41)
            r6 = 0
            android.opengl.GLES20.glGetProgramiv(r3, r5, r4, r6)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            r4 = r4[r6]     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            if (r4 != r0) goto L4c
            r7.f15448a = r3     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            r7.a()
            return
        L48:
            r0 = move-exception
            goto L73
        L4a:
            r0 = move-exception
            goto L73
        L4c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            r4.<init>(r1)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            java.lang.String r1 = android.opengl.GLES20.glGetProgramInfoLog(r3)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            r4.append(r1)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            java.lang.String r1 = r4.toString()     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            r0.<init>(r1)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            throw r0     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
        L62:
            r0 = move-exception
        L63:
            r3 = r2
            goto L73
        L65:
            r0 = move-exception
            goto L63
        L67:
            r0 = move-exception
        L68:
            r9 = r2
        L69:
            r3 = r9
            goto L73
        L6b:
            r0 = move-exception
            goto L68
        L6d:
            r0 = move-exception
        L6e:
            r8 = r2
            r9 = r8
            goto L69
        L71:
            r0 = move-exception
            goto L6e
        L73:
            if (r8 == r2) goto L78
            android.opengl.GLES20.glDeleteShader(r8)
        L78:
            if (r9 == r2) goto L7d
            android.opengl.GLES20.glDeleteShader(r9)
        L7d:
            if (r3 == r2) goto L82
            android.opengl.GLES20.glDeleteProgram(r3)
        L82:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.h.<init>(java.lang.String, java.lang.String):void");
    }

    public final void a() {
        int i11 = this.f15448a;
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(i11, "aPosition");
        this.f15451d = iGlGetAttribLocation;
        j.e(iGlGetAttribLocation, "aPosition");
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(i11, "uTransMatrix");
        this.f15449b = iGlGetUniformLocation;
        j.e(iGlGetUniformLocation, "uTransMatrix");
        int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(i11, "uAlphaScale");
        this.f15450c = iGlGetUniformLocation2;
        j.e(iGlGetUniformLocation2, "uAlphaScale");
    }

    public void b() {
        GLES20.glUseProgram(this.f15448a);
        j.b("glUseProgram");
        GLES20.glEnableVertexAttribArray(this.f15451d);
        j.b("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.f15451d, 2, 5126, false, 0, (Buffer) j.f15462h);
        j.b("glVertexAttribPointer");
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        GLES20.glUniformMatrix4fv(this.f15449b, 1, false, fArr, 0);
        j.b("glUniformMatrix4fv");
        GLES20.glUniform1f(this.f15450c, 1.0f);
        j.b("glUniform1f");
    }
}
