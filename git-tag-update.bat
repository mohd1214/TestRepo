For /f "tokens=1-3 delims=:." %%a in ("%TIME%") do (set NOW_TIME=%%a:%%b:%%c)
echo %NOW_TIME%
