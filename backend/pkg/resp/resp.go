package resp

type R struct {
	Code int    `json:"code"`
	Msg  string `json:"msg"`
	Data any    `json:"data,omitempty"`
}

func OK(data any) R    { return R{Code: 0, Msg: "ok", Data: data} }
func Err(msg string) R { return R{Code: 1, Msg: msg} }
